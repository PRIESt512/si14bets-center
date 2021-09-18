import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

plugins {
    id("org.springframework.boot") version "2.5.4"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("com.vaadin") version "0.14.6.0"
    id("java")
    kotlin("jvm") version "1.5.30"
    kotlin("plugin.spring") version "1.5.30"
}

defaultTasks("clean", "build")

java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

group = "ru.si14.bets.center"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.vaadin.com/vaadin-addons")
    }
}

tasks.jar {
    val format = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm:ss")
    manifest {
        attributes["Version"] = project.version
        attributes["Build-time"] = format.format(LocalDateTime.now())
    }
}

object Versions {
    const val vaadinVersion = "14.7.0"
    const val vaadinDSL = "1.1.0"
    const val vaadinHelper = "1.7.1"
    const val hazelcastVersion = "4.2.2"
    const val springCloudVersion = "2020.0.3"
    const val lombooVersion = "1.18.20"
}

dependencies {
    implementation(platform("com.vaadin:vaadin-bom:${Versions.vaadinVersion}"))
    implementation(platform("org.springframework.cloud:spring-cloud-dependencies:${Versions.springCloudVersion}"))

    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.vaadin:vaadin-spring-boot-starter:${Versions.vaadinVersion}")
    implementation("org.vaadin.artur:a-vaadin-helper:${Versions.vaadinHelper}")
    implementation("com.github.mvysny.karibudsl:karibu-dsl:${Versions.vaadinDSL}")

    implementation("org.springframework.kafka:spring-kafka")
    implementation("org.springframework.cloud:spring-cloud-stream-binder-kafka")

    implementation("com.hazelcast:hazelcast:${Versions.hazelcastVersion}")

    compileOnly ("org.projectlombok:lombok:${Versions.lombooVersion}")
    runtimeOnly("org.springframework.boot:spring-boot-devtools")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "16"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

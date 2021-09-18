package ru.si14bet

import com.vaadin.flow.component.dependency.NpmPackage
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.vaadin.artur.helpers.LaunchUtil

@SpringBootApplication
@NpmPackage.Container(
    NpmPackage(value = "@fontsource/oxygen", version = "4.5.0"),
    NpmPackage(value = "lumo-css-framework", version = "^4.0.10"),
    NpmPackage(value = "line-awesome", version = "1.3.0")
)
class StartApp

fun main(args: Array<String>) {
    LaunchUtil.launchBrowserInDevelopmentMode(runApplication<StartApp>(*args))
    // runApplication<StartApp>(*args)
}

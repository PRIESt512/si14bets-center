package ru.si14bet.hazelcast;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelCastConfig {

    @Bean
    @ConfigurationProperties("ru.si14bet.center.views.hazelcast.client")
    public HazelCastClientConfig hazelCastClientConfig() {
        return new HazelCastClientConfig();
    }

    @Bean
    public HazelcastInstance getHazelCastClient() {
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.setClusterName(hazelCastClientConfig().getClusterName());
        clientConfig.getNetworkConfig().addAddress(hazelCastClientConfig().getClusterAddress());
        clientConfig.setClassLoader(this.getClass().getClassLoader());

        var clientUserCodeDeploymentConfig = clientConfig.getUserCodeDeploymentConfig();
//        clientUserCodeDeploymentConfig.setEnabled(true)
//                .addClass(EventBook.class)
//                .addClass(Match.class)
//                .addClass(Member.class)
//                .addClass(MatchStatusType.class)
//                .addClass(User.class)
//                .addClass(Location.class)
//                .addClass(TeamMatch.class)
//                .addClass(TeamMatch.class)
//                .addClass(PartScore.class)
//                .addClass(EntryPuttingProcessor.class)
//                .addClass(MapOfOrders.class)
//                .addClass(Order.class)
//                .addClass(Order.OrderBuilder.class)
//                .addClass(IOrder.class)
//                .addClass(OrderAction.class)
//                .addClass(EntryRemovePlaceBetsProcessor.class)
//                .addClass(EntryIncreaseBalanceProcessor.class)
//                .addClass(EntryReduceBalanceProcessor.class)
//                .addClass(EntryAddAmountToEventProcessor.class)
//                .addClass(EntryPuttingUsersProcessor.class);

        clientConfig.setUserCodeDeploymentConfig(clientUserCodeDeploymentConfig);
        return HazelcastClient.newHazelcastClient(clientConfig);
    }

    public static class HazelCastClientConfig {

        private String clusterName;
        private String clusterAddress;

        public void setClusterName(String clusterName) {
            this.clusterName = clusterName;
        }

        public void setClusterAddress(String clusterAddress) {
            this.clusterAddress = clusterAddress;
        }

        public String getClusterName() {
            return clusterName;
        }

        public String getClusterAddress() {
            return clusterAddress;
        }
    }
}

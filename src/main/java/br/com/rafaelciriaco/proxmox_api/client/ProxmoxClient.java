package br.com.rafaelciriaco.proxmox_api.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ProxmoxClient {

    @Value("${api.base-url}")
    private String baseUrl;

    @Value("${api.token}")
    private String token;


    @Bean
    public RestClient restClient(RestClient.Builder builder) {
        return builder
                .baseUrl(baseUrl)// Opcional: para customizar timeouts
                .defaultHeader("Accept", "application/json")
                .defaultHeader("Authorization", token)
                .build();
    }

}

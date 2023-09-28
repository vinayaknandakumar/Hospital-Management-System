package com.Hospital.hospitalmanagementsystem.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class HealthFinderService {
    private final WebClient webClient;

    public HealthFinderService() {
        // Increase the buffer size
        ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(codec -> codec.defaultCodecs().maxInMemorySize(1048576))
                .build();

        this.webClient = WebClient.builder()
                .exchangeStrategies(strategies)
                .baseUrl("https://health.gov/myhealthfinder/api/v3")
                .build();
    }

    public Mono<String> getHealthFinderData(int age, String sex, String pregnant, String sexuallyActive, String tobaccoUse) {
        return webClient
                .get()
                .uri("/myhealthfinder.json?age={age}&sex={sex}&pregnant={pregnant}&sexuallyActive={sexuallyActive}&tobaccoUse={tobaccoUse}",
                        age, sex, pregnant, sexuallyActive, tobaccoUse)
                .retrieve()
                .bodyToMono(String.class);
    }
}


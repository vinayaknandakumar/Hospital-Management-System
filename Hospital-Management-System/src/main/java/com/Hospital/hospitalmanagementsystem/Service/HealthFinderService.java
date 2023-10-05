package com.Hospital.hospitalmanagementsystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class HealthFinderService {
    private final WebClient webClient;

    @Value("${health.baseurl}")
    private String url;

    //@Value("${spring.mail.username}")

    @Value("${codec.size}")
    private int maxInMemorySize;

    public HealthFinderService() {
        //System.out.println(url+" "+25);
        // Increase the buffer size
        ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(codec -> codec.defaultCodecs().maxInMemorySize(1048576))
                .build();

        this.webClient = WebClient.builder()
                .exchangeStrategies(strategies)
                .baseUrl(url)
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


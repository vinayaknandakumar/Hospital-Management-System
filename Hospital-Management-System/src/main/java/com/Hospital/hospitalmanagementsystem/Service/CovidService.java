package com.Hospital.hospitalmanagementsystem.Service;

import com.Hospital.hospitalmanagementsystem.Exception.LocationInvalidException;
import com.Hospital.hospitalmanagementsystem.Response.CovidContact;
import com.Hospital.hospitalmanagementsystem.Response.CovidData;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class CovidService {

    //private final WebClient webClient;

//    public CovidService() {
//        this.webClient = WebClient.builder()
//                .baseUrl("https://api.rootnet.in/covid19-in/stats/latest")
//                .build();
//    }

    public Mono<CovidData.Data.RegionalData> fetchCovidDataByLocation(String loc) {
        return WebClient
                .builder()
                .baseUrl("https://api.rootnet.in/covid19-in/stats/latest")
                .build()
                .get()
                .retrieve()
                .bodyToMono(CovidData.class)
                .flatMap(covidData -> filterDataByLocation(covidData, loc))
                .switchIfEmpty(Mono.error(new LocationInvalidException("Location not present")));
    }

    private Mono<CovidData.Data.RegionalData> filterDataByLocation(CovidData covidData, String loc) {
        return Mono.justOrEmpty(covidData.getData().getRegional().stream()
                .filter(data -> data.getLoc().equalsIgnoreCase(loc))
                .findFirst());
    }


    public Mono<CovidContact.Data.Contacts.Regional> fetchCovidContactHelpline(String loc){
        return WebClient
                .builder()
                .baseUrl("https://api.rootnet.in/covid19-in/contacts")
                .build()
                .get()
                .retrieve()
                .bodyToMono(CovidContact.class)
                .flatMap(covidContact -> filterContactByLocation(covidContact,loc))
                .switchIfEmpty(Mono.error(new LocationInvalidException("Location not found")));
    }

    private Mono<CovidContact.Data.Contacts.Regional> filterContactByLocation(CovidContact covidContact, String loc){
        return Mono.justOrEmpty(covidContact.getData().getContacts().getRegional().stream()
                .filter(data -> data.getLoc().equalsIgnoreCase(loc))
                .findFirst());
    }


}


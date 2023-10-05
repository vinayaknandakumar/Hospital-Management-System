package com.Hospital.hospitalmanagementsystem.Controller;

import com.Hospital.hospitalmanagementsystem.Response.CovidContact;
import com.Hospital.hospitalmanagementsystem.Response.CovidData;
import com.Hospital.hospitalmanagementsystem.Service.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/covid")
public class CovidController {

    @Autowired
    private CovidService covidService;

    @GetMapping("/data/{loc}")
    @ResponseBody
    public Mono<CovidData.Data.RegionalData> getCovidDataByLocation(@PathVariable String loc) {
        return covidService.fetchCovidDataByLocation(loc);
    }

    @GetMapping("/contact/{loc}")
    @ResponseBody
    public Mono<CovidContact.Data.Contacts.Regional> fetchCovidContactHelpline(@PathVariable String loc)  {
        return covidService.fetchCovidContactHelpline(loc);
    }

}

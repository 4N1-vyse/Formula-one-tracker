package com.weekend.F1;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class RaceService {
    public String dataReturn(){

        String raceData="https://api.jolpi.ca/ergast/f1/current.json";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(raceData,String.class);

    }


}

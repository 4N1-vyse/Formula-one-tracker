package com.weekend.F1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/races")
public class foneController {

    @Autowired
    private RaceService raceService;

    @GetMapping("/fetch-live")
    public String fetchCalendar(){
       return raceService.dataReturn();

    }

}

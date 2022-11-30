package at.fhtw.bic.uptimefh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UptimeController {

    @GetMapping("/uptime/minute")
    public double calculateUptimeminutes(@RequestParam double relative){

        double minutesofMonth = 60*24*30;
        double defineupttimeInPercent = relative / 100;


        return minutesofMonth * defineupttimeInPercent; // uptime in minutes
    }

    @GetMapping("/uptime/hour")
    public double calculateUptimeHours(@RequestParam double relative){
        double hoursOfMonth = 24*30;
        double defineupttimeInPercent = relative / 100;
        return hoursOfMonth * defineupttimeInPercent; // uptime in minutes
    }
/*
>>>>>>> master
    public double calculateUptimeInHours(@RequestParam double relative){
        double hoursofMonth = 24*30;
        double defineupttimeInPercent = relative / 100;

        return hoursofMonth * defineupttimeInPercent; // uptime in hours*/

}




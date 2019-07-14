package com.mysys.loadbalancer.eurekaBalancer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @RequestMapping("/")
    public String home() {
        return "version 0.1";
    }

    @RequestMapping("/test")
    public String healthCheck() {
        return "Spring boot started...";
    }
}

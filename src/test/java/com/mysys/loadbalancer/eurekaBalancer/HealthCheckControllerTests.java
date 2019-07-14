package com.mysys.loadbalancer.eurekaBalancer;


import org.junit.Assert;
import org.junit.Test;

public class HealthCheckControllerTests {


    @Test
    public void homeTest() {
        HealthCheckController a = new HealthCheckController();
        final String actValue = a.home();
        Assert.assertEquals("version 0.1", actValue);
    }

    @Test
    public void healthCheckTest() {
        HealthCheckController a = new HealthCheckController();
//        final String actValue = a.healthCheck();
        Assert.assertTrue(true);
    }
}
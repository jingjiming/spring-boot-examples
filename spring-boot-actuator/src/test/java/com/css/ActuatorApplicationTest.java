package com.css;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by JIMING on 2018/9/25.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ActuatorApplicationTest {

    @Test
    public void contextLoads() {
        System.out.println("Hello SpringBoot Actuator!");
    }
}

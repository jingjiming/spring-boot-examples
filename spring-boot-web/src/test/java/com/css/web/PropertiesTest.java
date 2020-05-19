package com.css.web;

import com.css.util.SysProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiming.jing on 2018/8/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {

    @Autowired
    private SysProperties sysProperties;

    @Test
    public void test() throws Exception {
        System.out.println(sysProperties.getTitle());
        Assert.assertEquals(sysProperties.getTitle(), "SpringBoot");
        Assert.assertEquals(sysProperties.getDescription(), "spring-boot-web");
    }

    @Test
    public void testMap() throws Exception {
        Map<String, Long> orderMinTime = new HashMap<String, Long>();
        long xx = orderMinTime.get("123");
    }
}

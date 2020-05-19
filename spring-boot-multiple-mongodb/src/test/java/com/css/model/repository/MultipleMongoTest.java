package com.css.model.repository;

import com.css.model.repository.primary.PrimaryMongoObject;
import com.css.model.repository.primary.PrimaryRepository;
import com.css.model.repository.secondary.SecondaryMongoObject;
import com.css.model.repository.secondary.SecondaryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by JIMING on 2018/9/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MultipleMongoTest {

    @Autowired
    private PrimaryRepository primaryRepository;

    @Autowired
    private SecondaryRepository secondaryRepository;

    @Test
    public void testSave() {
        System.out.println("************************************************************");
        System.out.println("测试开始");
        System.out.println("************************************************************");

        this.primaryRepository
                .save(new PrimaryMongoObject(null, "第一个库的对象"));

        this.secondaryRepository
                .save(new SecondaryMongoObject(null, "第二个库的对象"));

        // 查询第一个库
        List<PrimaryMongoObject> primaries = this.primaryRepository.findAll();
        for (PrimaryMongoObject primary : primaries) {
            System.out.println(primary.toString());
        }

        // 查询第二个库
        List<SecondaryMongoObject> secondaries = this.secondaryRepository.findAll();
        for (SecondaryMongoObject secondary : secondaries) {
            System.out.println(secondary.toString());
        }

        System.out.println("************************************************************");
        System.out.println("测试完成");
        System.out.println("************************************************************");
    }
}

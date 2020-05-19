package com.css.rabbitmq;

import com.css.rabbit.many.QueueSender;
import com.css.rabbit.many.QueueSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {
	@Autowired
	private QueueSender queueSender;

	@Autowired
	private QueueSender2 queueSender2;

    /**
     * 一对多发送
     * @throws Exception
     */
	@Test
	public void oneToMany() throws Exception {
		for (int i = 0; i < 100; i++) {
            queueSender.send(i);
		}
	}

    /**
     * 多对多发送
     * @throws Exception
     */
	@Test
	public void manyToMany() throws Exception {
		for (int i = 0; i < 100; i++) {
            queueSender.send(i);
            queueSender2.send(i);
		}
	}

}
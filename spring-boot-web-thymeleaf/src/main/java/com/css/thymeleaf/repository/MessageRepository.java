package com.css.thymeleaf.repository;

import com.css.thymeleaf.model.Message;

/**
 * Created by jiming.jing on 2018/7/26.
 */
public interface MessageRepository {

    Iterable<Message> findAll();

    Message save(Message message);

    Message findMessage(Long id);

    void deleteMessage(Long id);
}

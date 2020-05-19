package com.css.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jiming.jing on 2018/6/14.
 */
@Component
public class SysProperties {

    @Value("${com.css.title}")
    private String title;

    @Value("${com.css.description}")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

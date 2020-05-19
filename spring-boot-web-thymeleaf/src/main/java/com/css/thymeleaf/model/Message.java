package com.css.thymeleaf.model;

import javax.validation.constraints.NotEmpty;
import java.util.Calendar;

/**
 * Created by jiming.jing on 2018/7/26.
 */
public class Message {

    private Long id;
    @NotEmpty(message = "Text is required.")
    private String text;
    @NotEmpty(message = "Summary is required.")
    private String summary;

    private Calendar created = Calendar.getInstance();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotEmpty(message = "Text is required.") String getText() {
        return text;
    }

    public void setText(@NotEmpty(message = "Text is required.") String text) {
        this.text = text;
    }

    public @NotEmpty(message = "Summary is required.") String getSummary() {
        return summary;
    }

    public void setSummary(@NotEmpty(message = "Summary is required.") String summary) {
        this.summary = summary;
    }

    public Calendar getCreated() {
        return created;
    }

    public void setCreated(Calendar created) {
        this.created = created;
    }
}

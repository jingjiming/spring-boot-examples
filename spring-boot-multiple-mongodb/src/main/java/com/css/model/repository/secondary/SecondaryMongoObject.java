package com.css.model.repository.secondary;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by JIMING on 2018/9/11.
 */
@Document(collection = "second_mongo")
public class SecondaryMongoObject {

    @Id
    private String id;

    private String value;

    public SecondaryMongoObject() {
    }

    public SecondaryMongoObject(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SecondaryMongoObject{" + "id='" + id + '\'' + ", value='" + value + '\'' + '}';
    }
}

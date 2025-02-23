package com.css.model.repository.primary;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by JIMING on 2018/9/11.
 */
@Document(collection = "first_mongo")
public class PrimaryMongoObject {

    @Id
    private String id;

    private String value;

    public PrimaryMongoObject() {
    }

    public PrimaryMongoObject(String id, String value) {
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
        return "PrimaryMongoObject{" + "id='" + id + '\'' + ", value='" + value + '\'' + '}';
    }
}

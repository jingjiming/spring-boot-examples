package com.css.model.repository.primary;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by JIMING on 2018/9/11.
 */
public interface PrimaryRepository extends MongoRepository<PrimaryMongoObject, String> {
}

package com.css.model.repository.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by JIMING on 2018/9/11.
 */
public interface SecondaryRepository extends MongoRepository<SecondaryMongoObject, String> {
}

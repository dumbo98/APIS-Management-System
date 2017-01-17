package com.apis.management.repository;

import com.apis.management.model.Record;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by scottkim on 1/16/17.
 */
public interface RecordRepository extends MongoRepository<Record, String> {
}
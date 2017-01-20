package com.apis.management.repository;

import com.apis.management.model.Policy;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by scottkim on 1/16/17.
 */
public interface PolicyRepository extends MongoRepository<Policy, String> {
}
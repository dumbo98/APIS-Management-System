package com.apis.management.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by scottkim on 1/16/17.
 */
@EnableMongoRepositories(basePackages = "com.apis.management.repository")
@Configuration
public class MongoDBConfig extends AbstractMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        return "apis_ms";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("localhost", 27017);
    }
}
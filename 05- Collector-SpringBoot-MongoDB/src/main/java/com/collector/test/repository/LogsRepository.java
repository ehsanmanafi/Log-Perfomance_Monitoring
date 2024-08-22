package com.collector.test.repository;

import com.collector.test.entity.Logs;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogsRepository extends MongoRepository<Logs,String> {
}

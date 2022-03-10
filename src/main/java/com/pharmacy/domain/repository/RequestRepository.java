package com.pharmacy.domain.repository;

import com.pharmacy.domain.entities.Request;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RequestRepository extends MongoRepository<Request, String> {
}

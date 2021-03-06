package com.pharmacy.domain.repository;

import com.pharmacy.domain.entities.Remedy;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RemedyRepository extends MongoRepository<Remedy, String> {
}

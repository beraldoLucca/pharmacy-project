package com.pharmacy.domain.repository;

import com.pharmacy.domain.entities.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ClientRepository extends MongoRepository<Client, String> {
}

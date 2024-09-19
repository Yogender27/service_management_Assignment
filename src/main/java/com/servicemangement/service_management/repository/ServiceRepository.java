package com.servicemangement.service_management.repository;

import com.servicemangement.service_management.model.Service;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServiceRepository extends MongoRepository<Service,String> {
}

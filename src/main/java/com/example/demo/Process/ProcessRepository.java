package com.example.demo.Process;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessRepository extends MongoRepository<ProcessName,String>{

}

package com.example.demo.AppInsight;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppinRepository extends MongoRepository<AppinName,String>{

}

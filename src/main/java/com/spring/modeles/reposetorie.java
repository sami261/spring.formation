package com.spring.modeles;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface reposetorie extends MongoRepository<Etudiant,String> {

}

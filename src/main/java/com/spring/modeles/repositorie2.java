package com.spring.modeles;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface repositorie2 extends MongoRepository<Examen,String> {

@Query("{'Etudiant.nom':?0}")
    List<Examen> findBynom(String nom);



}

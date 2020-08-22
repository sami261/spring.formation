package com.spring.service;


import com.spring.modeles.Examen;
import com.spring.modeles.repositorie2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class Examservice {
    @Autowired
    private repositorie2 repo;



    public List<Examen> listt() {
       return repo.findAll();

    }


    public Examen save(Examen examen) {
            return  repo.insert(examen);
    }


    public Examen findbyid(String ide) {
        return repo.findById(ide).get();

    }

    public void suppr(String ide) {
        repo.deleteById(ide);
    }


    public List<Examen> findbynom(String nom) {


        return repo.findBynom(nom);



    }
}

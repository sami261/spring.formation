package com.spring.controllers;

import com.spring.modeles.Etudiant;
import com.spring.service.Etudservice;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Etudcontroller {

    @Autowired
    private Etudservice etudservice;

    @RequestMapping("/hello")

    public String home() {
        return "HELLO SAMI";
    }

    @PostMapping("/ajout")
    public Etudiant creernew(@RequestBody Etudiant e) { // requestbody nous permet de recuperer les valeurs du format jison en java et il nous faut un constructeure par defaut dans la classe tdo


        return etudservice.save(e);
    }

    @GetMapping(value = "/list") // getamapping c pour l path d url avec la methode GET
    public List<Etudiant> liste() {


        return etudservice.listeetud();
    }
    @GetMapping(value = "/{id}")
    public Etudiant recbyid(@PathVariable String id){

        return etudservice.getbyid(id);

    }

    @DeleteMapping   ( "/{id}")
    public void delete(@PathVariable String id){

        etudservice.delete(id);

}
}

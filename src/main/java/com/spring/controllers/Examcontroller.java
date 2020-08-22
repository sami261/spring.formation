package com.spring.controllers;







import com.spring.modeles.Examen;

import com.spring.service.Examservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Examcontroller {

    @Autowired
    private Examservice examservice;
    //private Etudiant etudiant;

    @RequestMapping("/helloex")

    public String home() {
        return "HELLO from exam";
    }
    @GetMapping("/listeex")
    public List<Examen> listex(){
        return examservice.listt();
    }

    @PostMapping("/ajoutex")
    public Examen creernew(@RequestBody Examen e) { // requestbody nous permet de recuperer les valeurs du format jison en java et il nous faut un constructeure par defaut dans la classe tdo


        return examservice.save(e);
    }
    @RequestMapping (value = "/i/{ide}")
    public Examen find(@PathVariable String ide){

        return examservice.findbyid(ide);

}
    @DeleteMapping   (value = "/d/{ide}")
    public void supp(@PathVariable String ide){

        examservice.suppr(ide);

    }
@GetMapping ("/findbynom/{nom}")
    public List<Examen> finbynomet(@PathVariable String nom){
        return examservice.findbynom(nom);
}

}


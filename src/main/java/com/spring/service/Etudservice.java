package com.spring.service;
import com.spring.modeles.reposetorie;
import com.spring.modeles.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Etudservice {


    @Autowired //injection de depend
    private reposetorie reposetorie;




    // recuperer tdos sous format liste
    public List<Etudiant> listeetud() {

        return reposetorie.findAll();

    }

    public  Etudiant save(Etudiant e){
        // premier etape avant d'utuliser mongobd
        //return mm.add(todo);
        return reposetorie.insert(e);
    }


    public Etudiant getbyid(String id) {
return reposetorie.findById(id).get();
    }


    public void delete(String id) {
        reposetorie.deleteById(id);
    }
}

package com.spring.modeles;

import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "examen")
public class Examen {


    @Id
    private String ide ;

    private String nomex;
    private String date;
    private int resultat;
    private List<Etudiant> etudiants;
    private Etudiant nomet;

    public Examen(Etudiant nomet) {
        this.nomet = nomet;
    }

    public Etudiant getNomet() {
        return nomet;
    }

    public void setNomet(Etudiant nomet) {
        this.nomet = nomet;
    }

    public Examen (){}

    public Examen(String ide, String nomex, String date, int resultat, List<Etudiant> etudiants) {
        this.ide = ide;
        this.nomex = nomex;
        this.date = date;
        this.resultat = resultat;
        this.etudiants = etudiants;
    }
    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public String getNomex() {
        return nomex;
    }

    public void setNomex(String nomex) {
        this.nomex = nomex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getResultat() {
        return resultat;
    }

    public void setResultat(int resultat) {
        this.resultat = resultat;
    }
}

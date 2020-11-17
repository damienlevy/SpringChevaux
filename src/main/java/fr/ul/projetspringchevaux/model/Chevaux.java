package fr.ul.projetspringchevaux.model;

import org.springframework.stereotype.Component;

@Component
public class Chevaux {
    private String nom;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Chevaux(){
        this.age = 1;
        this.nom = "Chevaux";
    }

    public Chevaux(String nom,int age){
        this.age = age;
        this.nom = nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return this.nom;
    }


}

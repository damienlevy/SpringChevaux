package fr.ul.projetspringchevaux.web.controller;

import fr.ul.projetspringchevaux.dao.IChevauxDAO;
import fr.ul.projetspringchevaux.model.Chevaux;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //fusionne @Controller et @ResponseBody , evite d'ecrire @Response body a chaque fonction ayant un retour
public class ChevauxController {

    @Autowired
    private IChevauxDAO dao;

    @GetMapping(value = "/Chevaux")
    public List<Chevaux> getChevaux(){
        return dao.findAll();
    }
    @GetMapping(value = "/Chevaux/{id}")
    public Chevaux getCheval(@PathVariable int id){
        return dao.findById(id);
    }

    @PostMapping(value = "Chevaux")
    public void addCheval(@RequestBody Chevaux c){
        dao.save(c);
    }
    
}

package fr.ul.projetspringchevaux.dao;

import fr.ul.projetspringchevaux.model.Chevaux;

import java.util.List;

public interface IChevauxDAO {

    public List<Chevaux> findAll();
    public Chevaux findById(int id);
    public void save(Chevaux chevaux);

}

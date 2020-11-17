package fr.ul.projetspringchevaux.dao;

import fr.ul.projetspringchevaux.model.Chevaux;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChevauxDAO implements IChevauxDAO{
    private ArrayList<Chevaux> chevaux;

    public ChevauxDAO(){
        this.chevaux = new ArrayList<>();

        this.chevaux.add(new Chevaux("Quovadis Collonges",14));
        this.chevaux.add(new Chevaux("Aventurine",10));
    }




    @Override
    public List<Chevaux> findAll() {
        return this.chevaux;
    }

    @Override
    public Chevaux findById(int id) {
        return this.chevaux.get(id);
    }

    @Override
    public void save(Chevaux chevaux) {
        this.chevaux.add(chevaux);

    }


}

package fr.epsi.dao;

import fr.epsi.model.Dmo;
import fr.epsi.model.Pharmacie;


import java.util.List;

public class PharmacieDao extends AbstractDao<Pharmacie> {

    
	public List<Dmo> getAll() {
        return this.execute(s -> s.createQuery("from pharmacie").list());
    }

}

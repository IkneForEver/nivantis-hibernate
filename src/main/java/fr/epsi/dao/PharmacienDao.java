package fr.epsi.dao;


import fr.epsi.model.Pharmacien;

import java.util.List;

public class PharmacienDao extends AbstractDao<Pharmacien> {

    
	public List<Pharmacien> getAll() {
        return this.execute(s -> s.createQuery("from pharmacien").list());
    }

}

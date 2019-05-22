package fr.epsi.dao;

import fr.epsi.model.Dmo;

import java.util.List;

public class DmoDao extends AbstractDao<Dmo> {

    public List<Dmo> getAll() {
        return this.execute(s -> s.createQuery("from dmo").list());
    }
}

package fr.epsi.dao;

import fr.epsi.model.Produit;

import java.util.List;

public class ProduitDao extends AbstractDao<Produit> {

    public List<Produit> getAll() {
        return this.execute(s -> s.createQuery("from produit").list());
    }

}

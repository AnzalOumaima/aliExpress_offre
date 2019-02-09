/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.service.impl;

import com.express.aliExpress_offre.bean.Categorie;
import com.express.aliExpress_offre.bean.Produit;
import com.express.aliExpress_offre.dao.OffreProduitDao;
import com.express.aliExpress_offre.service.OffreProduitService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class OffreProduitServiceImpl implements OffreProduitService {

    private OffreProduitDao produitDao;

    public OffreProduitDao getProduitDao() {
        return produitDao;
    }

    public void setProduitDao(OffreProduitDao produitDao) {
        this.produitDao = produitDao;
    }

    @Override
    public Produit findByReference(String reference) {
        return produitDao.findByReference(reference);
    }

    @Override
    public List<Produit> findByCategorie(Categorie categorie) {
        return produitDao.findByCategorie(categorie);
    }

    @Override
    public int crer(Produit produit) {
        Produit pro = findByReference(produit.getReference());
        if (pro != null) {
            return -1;
        } else {
            produitDao.save(produit);
            return 1;
        }
    }

}

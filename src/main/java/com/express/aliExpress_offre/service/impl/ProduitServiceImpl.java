/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.service.impl;

import com.express.aliExpress_offre.bean.Categorie;
import com.express.aliExpress_offre.bean.Produit;
import com.express.aliExpress_offre.service.ProduitService;
import java.util.List;
import org.springframework.stereotype.Service;
import com.express.aliExpress_offre.dao.ProduitDao;

/**
 *
 * @author Admin
 */
@Service
public class ProduitServiceImpl implements ProduitService {

    private ProduitDao produitDao;

    @Override
    public Produit findByReference(String reference) {
        return produitDao.findByReference(reference);
    }

    @Override
    public Produit find(Long id) {
        return produitDao.getOne(id);
    }

    @Override
    public List<Produit> findByCategorie(String reference) {
        return produitDao.findByCategorie(reference);
    }

    @Override
    public List<Produit> findAll() {
        return produitDao.findAll();
    }

    @Override
    public int save(Produit produit) {
        Produit pro = findByReference(produit.getReference());
        if (pro != null) {
            return -1;
        } else {
            produitDao.save(produit);
            return 1;
        }
    }

    public ProduitDao getProduitDao() {
        return produitDao;
    }

    public void setProduitDao(ProduitDao produitDao) {
        this.produitDao = produitDao;
    }

}

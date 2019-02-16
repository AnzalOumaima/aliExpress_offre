/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.service;

import com.express.aliExpress_offre.bean.Categorie;
import com.express.aliExpress_offre.bean.Produit;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ProduitService {

    public Produit findByReference(String reference);

    public Produit find(Long id);

    public List<Produit> findByCategorie(String reference);

    public List<Produit> findAll();

    public int save(Produit produit);

}

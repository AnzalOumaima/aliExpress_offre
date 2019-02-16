/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.service;

import com.express.aliExpress_offre.bean.Categorie;
import com.express.aliExpress_offre.bean.OffreProduit;
import com.express.aliExpress_offre.bean.Produit;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface OffreProduitService {

    public OffreProduit findByReference(String reference);

    public OffreProduit find(Long id);

    public List<OffreProduit> findByProduit(String reference);

    public List<OffreProduit> findAll();

    public OffreProduit save(OffreProduit offreProduit);

}

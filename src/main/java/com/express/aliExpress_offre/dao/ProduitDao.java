/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.dao;

import com.express.aliExpress_offre.bean.Categorie;
import com.express.aliExpress_offre.bean.Produit;
import java.util.List;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface ProduitDao extends JpaRepositoryImplementation<Produit, Long> {

    public Produit findByReference(String reference);

    public List<Produit> findByCategorie(Categorie categorie);

}

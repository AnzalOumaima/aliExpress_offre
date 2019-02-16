/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.rest.converter;

import com.express.aliExpress_offre.bean.Produit;
import com.express.aliExpress_offre.rest.vo.ProduitVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc asus
 */
public class ProduitVoConverter {

    public Produit toItem(ProduitVo produitVo) {
        Produit produit = new Produit();
        if (produitVo != null) {

            if (produitVo.getLibelle() != null) {
                produit.setLibelle(produitVo.getLibelle());
            }
            if (produitVo.getReference() != null) {
                produit.setReference(produitVo.getReference());
            }
            if (produitVo.getCategorieVo() != null) {
                produit.setCategorie(new CategorieVoConverter().toItem(produitVo.getCategorieVo()));
            }
        }
        return produit;
    }

    public ProduitVo toVo(Produit produit) {
        ProduitVo produitVo = new ProduitVo();

        if (produit != null) {
            if (produit.getLibelle() != null) {
                produitVo.setLibelle(produit.getLibelle());
            }
            if (produit.getReference() != null) {
                produitVo.setReference(produit.getReference());
            }
            if (produit.getCategorie() != null) {
                produitVo.setCategorieVo(new CategorieVoConverter().toVo(produit.getCategorie()));
            }
        }
        return produitVo;
    }

    public List<ProduitVo> toVo(List<Produit> produits) {
        List<ProduitVo> produitVos = new ArrayList();
        if (produits != null && !produits.isEmpty()) {
            for (Produit produit : produits) {
                produitVos.add(toVo(produit));
            }
        }
        return produitVos;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.rest.converter;

import com.express.aliExpress_offre.bean.Categorie;
import com.express.aliExpress_offre.rest.vo.CategorieVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc asus
 */
public class CategorieVoConverter {
    
    public Categorie toItem(CategorieVo categorieVo) {
        Categorie categorie = new Categorie();
        if (categorieVo != null) {
            if (categorieVo.getLibelle() != null) {
                categorie.setLibelle(categorieVo.getLibelle());
            }
            if (categorieVo.getReference() != null) {
                categorie.setReference(categorieVo.getReference());
            }
            if (categorieVo.getDomaineVo() != null) {
                categorie.setDomaine(new DomaineVoConverter().toItem(categorieVo.getDomaineVo()));
                
            }
        }
        return categorie;
    }
    
    public CategorieVo toVo(Categorie categorie) {
        CategorieVo categorieVo = new CategorieVo();
        if (categorie != null) {
            if (categorie.getLibelle() != null) {
                categorieVo.setLibelle(categorie.getLibelle());
            }
            if (categorie.getReference() != null) {
                categorieVo.setReference(categorie.getReference());
            }
            if (categorie.getDomaine() != null) {
                categorieVo.setDomaineVo(new DomaineVoConverter().toVo(categorie.getDomaine()));
            }
        }
        return categorieVo;
    }
    
    public List<CategorieVo> toVo(List<Categorie> categories) {
        List<CategorieVo> categorieVos = new ArrayList();
        if (categories != null && !categories.isEmpty()) {
            for (Categorie categorie : categories) {
                categorieVos.add(toVo(categorie));
            }
        }
        return categorieVos;
    }
}

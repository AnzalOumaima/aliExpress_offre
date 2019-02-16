/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.rest.converter;

import com.express.aliExpress_offre.bean.OffreProduit;
import com.express.aliExpress_offre.commun.util.NumberUtil;
import com.express.aliExpress_offre.rest.vo.OffreProduitVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc asus
 */
public class OffreProduitVoConverter {

    public OffreProduit toItem(OffreProduitVo offreProduitVo) {
        OffreProduit offreProduit = new OffreProduit();
        if (offreProduitVo != null) {
            if (offreProduitVo.getReference() != null) {
                offreProduit.setReference(offreProduitVo.getReference());
            }
            if (offreProduitVo.getLibelle() != null) {
                offreProduit.setLibelle(offreProduitVo.getLibelle());
            }
            if (offreProduitVo.getQte() != null) {
                offreProduit.setQte(NumberUtil.toDouble(offreProduitVo.getQte()));
            }
            if (offreProduitVo.getPrix() != null) {
                offreProduit.setPrix(NumberUtil.toDouble(offreProduitVo.getPrix()));
            }
            if (offreProduitVo.getRemise() != null) {
                offreProduit.setRemise(NumberUtil.toDouble(offreProduitVo.getRemise()));
            }
            if (offreProduitVo.getProduitVo() != null) {
                offreProduit.setProduit(new ProduitVoConverter().toItem(offreProduitVo.getProduitVo()));
            }

        }
        return offreProduit;
    }

    public OffreProduitVo toVo(OffreProduit offreProduit) {
        OffreProduitVo offreProduitVo = new OffreProduitVo();
        if (offreProduit != null) {
            if (offreProduit.getReference() != null) {
                offreProduitVo.setReference(offreProduit.getReference());
            }
            if (offreProduit.getLibelle() != null) {
                offreProduitVo.setLibelle(offreProduit.getLibelle());
            }
            if (offreProduit.getQte() != 0) {
                offreProduitVo.setPrix(offreProduit.getPrix() + "");
            }
            if (offreProduit.getRemise() != 0) {
                offreProduitVo.setRemise(offreProduit.getRemise() + "");
            }
            if (offreProduit.getPrix() != 0) {
                offreProduitVo.setPrix(offreProduit.getPrix() + "");
            }
            if (offreProduit.getProduit() != null) {
                offreProduitVo.setProduitVo(new ProduitVoConverter().toVo(offreProduit.getProduit()));
            }
        }
        return offreProduitVo;
    }

    public List<OffreProduitVo> toVo(List<OffreProduit> offreProduits) {
        List<OffreProduitVo> offreProduitVos = new ArrayList();
        if (offreProduits != null && !offreProduits.isEmpty()) {
            for (OffreProduit offreProduit : offreProduits) {
                offreProduitVos.add(toVo(offreProduit));
            }
        }
        return offreProduitVos;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.rest.converter;

import com.express.aliExpress_offre.bean.Domaine;
import com.express.aliExpress_offre.rest.vo.DomaineVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc asus
 */
public class DomaineVoConverter {

    public Domaine toItem(DomaineVo domaineVo) {
        Domaine domaine = new Domaine();
        if (domaineVo != null) {
            if (domaineVo.getReference() != null) {
                domaine.setReference(domaineVo.getReference());
            }
            if (domaineVo.getLibelle() != null) {
                domaine.setLibelle(domaineVo.getLibelle());
            }
        }
        return domaine;
    }

    public DomaineVo toVo(Domaine domaine) {
        DomaineVo domaineVo = new DomaineVo();
        if (domaine != null) {
            if (domaine.getReference() != null) {
                domaineVo.setReference(domaine.getReference());
            }
            if (domaine.getLibelle() != null) {
                domaineVo.setLibelle(domaine.getLibelle());
            }

        }
        return domaineVo;
    }

    public List<DomaineVo> toVo(List<Domaine> domaines) {
        List<DomaineVo> domaineVos = new ArrayList();
        if (domaines != null && !domaines.isEmpty()) {
            for (Domaine domaine : domaines) {
                domaineVos.add(toVo(domaine));
            }
        }
        return domaineVos;
    }
}

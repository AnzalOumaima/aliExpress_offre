/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.service.impl;

import com.express.aliExpress_offre.bean.OffreProduit;
import com.express.aliExpress_offre.dao.OffreProduitDao;
import com.express.aliExpress_offre.rest.proxy.FournisseurProxy;
import com.express.aliExpress_offre.rest.vo.ProduitVo;
import com.express.aliExpress_offre.service.OffreProduitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc asus
 */
@Service
public class OffreProduitServiceImpl implements OffreProduitService {

    @Autowired
    private OffreProduitDao offreProduitDao;

    @Autowired
    private FournisseurProxy fournisseurProxy;

    @Override
    public OffreProduit findByReference(String reference) {
        return offreProduitDao.findByReference(reference);
    }

    @Override
    public OffreProduit find(Long id) {
        return offreProduitDao.getOne(id);
    }

    @Override
    public List<OffreProduit> findByProduit(String reference) {
        return offreProduitDao.findByProduit(reference);
    }

    @Override
    public List<OffreProduit> findAll() {
        return offreProduitDao.findAll();
    }

    @Override
    public OffreProduit save(OffreProduit offreProduit) {
        OffreProduit pro = findByReference(offreProduit.getReference());
        if (pro != null) {
            return null;
        } else {
            //FournisseurVo fournisseurVo = fournisseurProxy.findByReference(offreProduit.getReferenceFournisseur());
//            if (fournisseurVo != null && fournisseurVo.getReference() != null) {
//                produitDao.save(offreProduit);
//
//            }
            return offreProduit;
        }
    }

    public OffreProduitDao getProduitDao() {
        return offreProduitDao;
    }

    public void setProduitDao(OffreProduitDao produitDao) {
        this.offreProduitDao = produitDao;
    }

}

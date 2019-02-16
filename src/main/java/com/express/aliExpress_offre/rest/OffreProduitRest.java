/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.rest;

import com.express.aliExpress_offre.bean.OffreProduit;
import com.express.aliExpress_offre.rest.converter.OffreProduitVoConverter;
import com.express.aliExpress_offre.rest.proxy.FournisseurProxy;
import com.express.aliExpress_offre.rest.vo.OffreProduitVo;
import com.express.aliExpress_offre.service.OffreProduitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author pc asus
 */
public class OffreProduitRest {

    @Autowired
    private OffreProduitService offreProduitService;

    @Autowired
    private FournisseurProxy fournisseurProxy;

    @GetMapping("/{id}")
    public OffreProduitVo find(Long id) {
        return new OffreProduitVoConverter().toVo(offreProduitService.find(id));
    }

    @GetMapping("/")
    public List<OffreProduitVo> findAll() {
        return new OffreProduitVoConverter().toVo(offreProduitService.findAll());
    }

    @GetMapping("/reference/{reference}")
    public OffreProduitVo findByReference(@PathVariable String reference) {
        return new OffreProduitVoConverter().toVo(offreProduitService.findByReference(reference));
    }

    @GetMapping("/reference/{reference}")
    public List<OffreProduitVo> findByProduit(@PathVariable String reference) {
        return new OffreProduitVoConverter().toVo(offreProduitService.findByProduit(reference));
    }

    @GetMapping("/reference/{reference}")
    public OffreProduitVo findFournisseurByReference(@PathVariable String reference) {
        return fournisseurProxy.findByReference(reference);
    }

    @PostMapping("/")
    public OffreProduitVo save(@RequestBody OffreProduit offreProduit) {
        return new OffreProduitVoConverter().toVo(offreProduitService.save(offreProduit));
    }

    public FournisseurProxy getFournisseurProxy() {
        return fournisseurProxy;
    }

    public void setFournisseurProxy(FournisseurProxy fournisseurProxy) {
        this.fournisseurProxy = fournisseurProxy;
    }

    public OffreProduitService getOffreProduitService() {
        return offreProduitService;
    }

    public void setOffreProduitService(OffreProduitService offreProduitService) {
        this.offreProduitService = offreProduitService;
    }

}

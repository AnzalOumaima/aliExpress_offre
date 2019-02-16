/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.rest;

import com.express.aliExpress_offre.bean.Categorie;
import com.express.aliExpress_offre.bean.Produit;
import com.express.aliExpress_offre.rest.converter.ProduitVoConverter;
import com.express.aliExpress_offre.rest.vo.ProduitVo;
import com.express.aliExpress_offre.service.ProduitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pc asus
 */
@RestController
@RequestMapping("/aliExpress_offre/offres")
public class ProduitRest {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/reference/{reference}")
    public Produit findByReference(String reference) {
        return produitService.findByReference(reference);
    }

    @GetMapping("/{id}")
    public Produit find(Long id) {
        return produitService.find(id);
    }

    @GetMapping("/reference/{reference}")
    public List<Produit> findByCategorie(String reference) {
        return produitService.findByCategorie(reference);
    }

    @GetMapping("/")
    public List<Produit> findAll() {
        return produitService.findAll();
    }

    @PostMapping("/")
    public int save(Produit produit) {
        return produitService.save(produit);
    }

    public ProduitService getProduitService() {
        return produitService;
    }

    public void setProduitService(ProduitService produitService) {
        this.produitService = produitService;
    }

}

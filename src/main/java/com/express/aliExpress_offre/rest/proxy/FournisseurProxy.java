/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.rest.proxy;

import com.express.aliExpress_offre.rest.vo.OffreProduitVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author pc asus
 */
@FeignClient(name = "microservice-fournisseurs", url = "localhost:8099")
public interface FournisseurProxy {

    @GetMapping("aliExpress_fournisseur/fournisseurs/reference/{reference}")
    public OffreProduitVo findByReference(@PathVariable("reference") String reference);

}

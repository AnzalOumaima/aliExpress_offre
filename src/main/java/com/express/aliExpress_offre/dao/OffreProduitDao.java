/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.dao;

import com.express.aliExpress_offre.bean.OffreProduit;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Admin
 */
public interface OffreProduitDao extends JpaRepository<OffreProduit, Long> {

    public OffreProduit findByReference(String reference);

    public List<OffreProduit> findByProduit(String reference);

}

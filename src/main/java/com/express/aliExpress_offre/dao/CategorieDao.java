/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.dao;

import com.express.aliExpress_offre.bean.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface CategorieDao extends JpaRepository<Categorie, Long>{
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.rest.vo;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class DomaineVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private String reference;
    private String libelle;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.rest.converter;

import com.express.aliExpress_offre.bean.PhotoProduit;
import com.express.aliExpress_offre.rest.vo.PhotoProduitVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc asus
 */
public class PhotoProduitVoConverter {

    public PhotoProduit toItem(PhotoProduitVo photoProduitVo) {
        PhotoProduit photoProduit = new PhotoProduit();
        if (photoProduitVo != null) {
            if (photoProduitVo.getLien() != null) {
                photoProduit.setLien(photoProduitVo.getLien());
            }
            if (photoProduitVo.getDescription() != null) {
                photoProduit.setDescription(photoProduitVo.getDescription());
            }
            if (photoProduitVo.getOffreProduitVo() != null) {
                photoProduit.setOffreProduit(new OffreProduitVoConverter().toItem(photoProduitVo.getOffreProduitVo()));
            }
        }
        return photoProduit;
    }

    public PhotoProduitVo toVo(PhotoProduit photoProduit) {
        PhotoProduitVo photoProduitVo = new PhotoProduitVo();
        if (photoProduit != null) {
            if (photoProduit != null) {
                photoProduitVo.setLien(photoProduit.getLien());
            }
            if (photoProduit.getDescription() != null) {
                photoProduitVo.setDescription(photoProduit.getDescription());
            }
            if (photoProduit.getOffreProduit() != null) {
                photoProduitVo.setOffreProduitVo(new OffreProduitVoConverter().toVo(photoProduit.getOffreProduit()));
            }
        }
        return photoProduitVo;
    }

    public List<PhotoProduitVo> toVo(List<PhotoProduit> photoProduits) {
        List<PhotoProduitVo> photoProduitVos = new ArrayList();
        if (photoProduits != null && !photoProduits.isEmpty()) {
            for (PhotoProduit photoProduit : photoProduits) {
                photoProduitVos.add(toVo(photoProduit));
            }
        }
        return photoProduitVos;
    }
}

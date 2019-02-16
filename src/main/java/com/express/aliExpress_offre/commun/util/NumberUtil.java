/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.express.aliExpress_offre.commun.util;

/**
 *
 * @author pc asus
 */
public class NumberUtil {
    
    public static final Double ZERO = new Double(0D);
    
    public static Double toDouble(String value) {
        if (value == null || value.isEmpty()) {
            return ZERO;
        } else {
            return Double.parseDouble(value);
        }
    }
    
}

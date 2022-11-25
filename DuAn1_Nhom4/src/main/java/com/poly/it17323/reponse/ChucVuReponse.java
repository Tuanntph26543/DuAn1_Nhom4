/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.reponse;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.poly.it17323.domainmodel.ChucVu;

/**
 *
 * @author nguye
 */
@Getter
@Setter
public class ChucVuReponse {
    private Integer maCV;
    private String tenCV;

    public ChucVuReponse() {
    }

    public ChucVuReponse(ChucVu chucVu) {
        this.maCV = chucVu.getMaCV();
        this.tenCV = chucVu.getTenCV();
    }

    @Override
    public String toString() {
        return tenCV;
    }
    
    
}


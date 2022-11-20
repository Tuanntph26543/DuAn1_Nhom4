/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.viewmodel;

import com.poly.it17323.domalmodel.ChucVu;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author nguye
 */
@Getter
@Setter
@ToString
public class ChucVuReponse {
    private Integer maCV;
    private String tenCV;

    public ChucVuReponse() {
    }

    public ChucVuReponse(ChucVu chucVu) {
        this.maCV = chucVu.getMacv();
        this.tenCV = chucVu.getTecv();
    }
}

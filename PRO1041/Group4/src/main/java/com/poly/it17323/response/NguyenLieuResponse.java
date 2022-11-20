/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.response;

import com.poly.it17323.domainmodel.NguyenLieu;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author My PC
 */
@Getter
@Setter
@ToString
public class NguyenLieuResponse {
    private Integer maNL;
    private String tenNL;
    private String moTa;

    public NguyenLieuResponse() {
    }

    public NguyenLieuResponse(Integer maNL, String tenNL, String moTa) {
        this.maNL = maNL;
        this.tenNL = tenNL;
        this.moTa = moTa;
    }

    public NguyenLieuResponse(NguyenLieu x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

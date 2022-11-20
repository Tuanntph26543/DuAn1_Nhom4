/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.response;

import com.poly.it17323.domainmodel.NhaCungCap;

/**
 *
 * @author My PC
 */
public class NhaCungCapResponse {
    private Integer maNCC;
    private String tenNCC;
    private String diaChi;
    private String sdt;

    public NhaCungCapResponse() {
    }

    public NhaCungCapResponse(Integer maNCC, String tenNCC, String diaChi, String sdt) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public NhaCungCapResponse(NhaCungCap ncc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

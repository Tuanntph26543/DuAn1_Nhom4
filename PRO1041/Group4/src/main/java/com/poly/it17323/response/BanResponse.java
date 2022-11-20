/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.response;

import com.poly.it17323.domainmodel.Ban;
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
public class BanResponse { // response truy vấn trực tiếp trên entity
    private Integer maBan;
    private String tenBan;
    private Integer soNguoiMax;
    private Integer trangThai;


    public BanResponse() {
    }

    public BanResponse(Integer maBan, String tenBan, Integer soNguoiMax, Integer trangThai) {
        this.maBan = maBan;
        this.tenBan = tenBan;
        this.soNguoiMax = soNguoiMax;
        this.trangThai = trangThai;
    }

    public BanResponse(Ban ban) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
    
}

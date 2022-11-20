/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.reponse;

import com.poly.it17323.domainmodel.ChucVu;
import com.poly.it17323.domainmodel.UserTT;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author FPT Shop
 */

@Getter
@Setter
@ToString
public class UserTTReponse {
    private Integer maNV ;
    private ChucVu chucVu;
    private String tenCV;
    private String hoTen;
    private String gioiTinh; 
    private Integer namSinh;
    private String diaChi;
    private String cccd;
    private String sdt;
    private String taiKhoan;
    private String matKhau;
    private Integer trangThai;

    public UserTTReponse() {
    }

    public UserTTReponse(UserTT user) {
        this.chucVu = user.getChucVu();
        this.tenCV = user.getChucVu().getTenCV();
        this.hoTen = user.getHoTen();
        this.gioiTinh = user.getGioiTinh();
        this.namSinh = user.getNamSinh();
        this.diaChi = user.getDiaChi();
        this.cccd = user.getCccd();
        this.sdt = user.getSdt();
        this.taiKhoan = user.getTaiKhoan();
        this.matKhau = user.getMatKhau();
        this.trangThai = user.getTrangThai();
    }

    
    
}



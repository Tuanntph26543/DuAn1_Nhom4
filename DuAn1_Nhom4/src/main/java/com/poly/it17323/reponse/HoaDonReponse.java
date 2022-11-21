/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.reponse;

import com.poly.it17323.domainmodel.HoaDon;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HoaDonReponse {
    private Integer maHD;
    private Integer maNV;
    private Integer tinhTrang;
    private Date ngaoTao;

    public HoaDonReponse() {
    }

    public HoaDonReponse(HoaDon hoaDon) {
        this.maHD = hoaDon.getMaHD();
        this.maNV = hoaDon.getUserTT().getMaNV();
        this.tinhTrang = hoaDon.getTinhTrang();
        this.ngaoTao = hoaDon.getNgayTao();
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.nhom4.reponse;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import poly.nhom4.domainmodel.KhachHang;

/**
 *
 * @author Admin
 */
@Getter
@Setter
@ToString
public class KhachHangReponse {
    private Integer maKH;
    private String tenKH;
    private String sdt;     
    private String diaChi;

    public KhachHangReponse() {
    }

    public KhachHangReponse(KhachHang kh) {
        this.maKH = kh.getMAKH();
        this.tenKH = kh.getTENKH();
        this.sdt = kh.getSDT();
        this.diaChi = kh.getDIACHI();
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.reponse;

import com.poly.it17323.domainmodel.KhuyenMai;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Admin
 */
@Getter
@Setter
@ToString
public class KhuyenMaiReponse {

    private Integer maKM;
    private String tenKM;
    private Float soTienKM;
    private Date ngayBD;
    private Date ngayKT;
    private Integer trangThai;

    public KhuyenMaiReponse() {
    }

    public KhuyenMaiReponse(KhuyenMai km) {
        this.maKM = km.getMaKM();
        this.tenKM = km.getTenKM();
        this.soTienKM = km.getSoTienKM();
        this.ngayBD = km.getNgayBD();
        this.ngayKT = km.getNgayKT();
        this.trangThai = km.getTrangThai();
    }

    public Object[] toDataRow() {
        return new Object[]{maKM, tenKM, soTienKM, ngayBD, ngayKT, trangThai==0?"Đang Áp dụng":"Ngừng Áp dụng"};
    }
}

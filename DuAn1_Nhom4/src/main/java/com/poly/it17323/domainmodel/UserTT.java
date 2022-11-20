/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.domainmodel;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author nguye
 */
@Entity
@Table(name = "USERTT")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserTT {

    @Id  //khoachinh
    @Column(name = "MANV")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maNV;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MACV", referencedColumnName = "MACV")
    private ChucVu chucVu;

    @Column(name = "HOTEN")
    private String hoTen;

    @Column(name = "GIOITINH")
    private String gioiTinh;

    @Column(name = "NAMSINH")
    private Integer namSinh;

    @Column(name = "DIACHI")
    private String diaChi;

    @Column(name = "CCCD")
    private String cccd;
    
    @Column(name = "SDT")
    private String sdt;

    @Column(name = "TAIKHOAN")
    private String taiKhoan;

    @Column(name = "MATKHAU")
    private String matKhau;

    @Column(name = "TRANGTHAI")
    private Integer trangThai;
}

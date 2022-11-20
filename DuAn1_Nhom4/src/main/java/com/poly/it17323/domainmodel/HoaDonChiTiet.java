/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.domainmodel;

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
@Table(name = "HOADONCHITIET")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HoaDonChiTiet {

    @Id  //khoachinh
    @Column(name = "MAHOADONCT")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maHDCT;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAHD", referencedColumnName = "MAHD")
    private HoaDon hoaDon;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MASP", referencedColumnName = "MASP")
    private SanPham sanPham;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MABAN", referencedColumnName = "MABAN")
    private Ban ban;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MACOMBOCT", referencedColumnName = "MACOMBOCT")
    private ComBoChiTiet comBoChiTiet;

    @Column(name = "SOLUONG")
    private Integer soLuong;

    @Column(name = "DONGIA")
    private Double donGia;

    @Column(name = "MOTA")
    private String moTa;

}

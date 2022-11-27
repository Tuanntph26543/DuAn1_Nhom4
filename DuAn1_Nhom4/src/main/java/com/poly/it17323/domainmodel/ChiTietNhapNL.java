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
@Table(name = "CHITIETNHAPNL")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietNhapNL {

    @Id  //khoachinh
    @Column(name = "MACHITIETNNL")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maCTNNL;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANL", referencedColumnName = "MANL")
    private NguyenLieu nguyenLieu;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAHDNNL", referencedColumnName = "MAHDNNL")
    private HoaDonNhapNL hoaDonNhapNL;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANCC", referencedColumnName = "MANCC")
    private NhaCungCap nhaCungCap;

    @Column(name = "SOLUONG")
    private Integer soLuong;
    
    @Column(name = "THANHTIEN")
    private Double thanhTien;
}

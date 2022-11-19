/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.domalmodel;

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
@Table(name = "HOADON")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HoaDon {

//    @Id  //khoachinh
//    @Column(name = "MAHD")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer MAHD;
//    
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "MANV", referencedColumnName = "MANV")
//    private UserTT USERTT;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "MANV", referencedColumnName = "MANV")
//    private KhachHang KHACHHANG;
//    
//    @Column(name = "TINHTRANG")
//    private Integer TINHTRANG;
//    
//    @Column(name = "NGAYTAO")
//    private Date NGAYTAO;

}

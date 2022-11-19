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
@Table(name = "HOADON")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HoaDon {

    @Id  //khoachinh
    @Column(name = "MAHD")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maHD;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANV", referencedColumnName = "MANV")
    private UserTT userTT;
    
    @Column(name = "TENKH")
    private String tenKH;
    
    @Column(name = "DIACHIKH")
    private String diaChi;
    
    @Column(name = "SDTKH")
    private String sdt;
    
    @Column(name = "TINHTRANG")
    private Integer tinhTrang;
    
    @Column(name = "NGAYTAO")
    private Date ngayTao;

}

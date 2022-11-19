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
    private Integer MANV;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MACV", referencedColumnName = "MACV")
    private ChucVu CHUCVU;
    
    @Column(name = "HOTEN")
    private String HOTEN;
    
    @Column(name = "GIOITINH")
    private String GIOITINH;
    
    @Column(name = "NGAYSINH")
    private Date NGAYSINH;
    
    @Column(name = "SDT")
    private String SDT;
    
    @Column(name = "TAIKHOAN")
    private String TAIKHOAN;
    
    @Column(name = "MATKHAU")
    private String MATKHAU;
    
    @Column(name = "TRANGTHAI")
    private Integer TRANGTHAI;
}

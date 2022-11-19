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
 */@Entity
@Table(name = "SANPHAM")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ComBo {
    @Id  //khoachinh
    @Column(name = "MACOMBO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maCombo;
    
    @Column(name = "TENCOMBO")
    private String tenCombo;
    
    @Column(name = "GIATIEN")
    private Double giaTien;
    
    @Column(name = "HINHANH")
    private String hinhAnh;
    
    @Column(name = "TRANGTHAI")
    private Integer trangThai;
}

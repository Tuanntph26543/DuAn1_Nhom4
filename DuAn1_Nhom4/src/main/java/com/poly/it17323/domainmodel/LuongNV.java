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
@Table(name = "LUONGNV")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LuongNV {

    @Id  //khoachinh
    @Column(name = "MALUONGNV")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maLuongNV;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANV", referencedColumnName = "MANV")
    private UserTT userTT;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MACLV", referencedColumnName = "MACLV")
    private CaLamViec caLamViec;
    
    @Column(name = "TONGSOCALAM")
    private Integer tongSoCaLam;
    
    @Column(name = "THANHTIEN")
    private Double thanhTien;
}

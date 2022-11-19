/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.domalmodel;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "CALAMVIEC")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CaLamViec {

    @Id  //khoachinh
    @Column(name = "MACLV")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer MACLV;

    @Column(name = "TENCLV")
    private String TENCLV;

    @Column(name = "GIOBD")
    private Date GIOBD;
    
    @Column(name = "GIOKT")
    private Date GIOKT;
    
    @Column(name = "SOTIEN")
    private Double SOTIEN;
}

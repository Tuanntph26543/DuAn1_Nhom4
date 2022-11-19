/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.domalmodel;

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
@Table(name = "ban")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Ban {

    @Id  //khoachinh
    @Column(name = "MABAN")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer MABAN;

    @Column(name = "TENBAN")
    private String TENBAN;
    
    @Column(name = "SONGUOINGOIMAX")
    private Integer SONGUOINGOIMAX;
    
    @Column(name = "TRANGTHAI")
    private Integer TRANGTHAI;
}

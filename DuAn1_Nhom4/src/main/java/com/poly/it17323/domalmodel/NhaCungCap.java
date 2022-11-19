/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.domalmodel;

import java.math.BigDecimal;
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
@Table(name = "ncc")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class NhaCungCap {

    @Id  //khoachinh
    @Column(name = "MANCC")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer MANCC;

    @Column(name = "TENNCC")
    private String TENNCC;

    @Column(name = "DIACHI")
    private String DIACHI;

    @Column(name = "SDT")
    private String SDT;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.domainmodel;

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
@Table(name="chucvu")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ChucVu {
    @Id  //khoachinh
    @Column(name="MACV")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maCV;
    
    @Column(name = "TECV")
    private String tenCV;
}

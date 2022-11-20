/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom4.IT17323.domainmodel;

/**
 *
 * @author Quoc
 */
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

@Entity
@Table(name = "product")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    @Id
    @Column(name = "MASP")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idsp;

    @Column(name = "MAKM")
    private Long idkm;

    @Column(name = "TENSP")
    private String tensp;

    @Column(name = "GIABAN")
    private Float giaban;

    @Column(name = "TRANGTHAI")
    private Long trangthai;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAKM", referencedColumnName = "MASP")
    private Combo category;

}

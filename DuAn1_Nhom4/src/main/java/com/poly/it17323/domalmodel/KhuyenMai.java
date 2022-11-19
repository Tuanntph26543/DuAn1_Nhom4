package com.poly.it17323.domalmodel;

import java.math.BigDecimal;
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

@Entity
@Table(name = "KHUYENMAI")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KhuyenMai {

    @Id  //khoachinh
    @Column(name = "MAKM")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer MAKM;

    @Column(name = "TENKM")
    private String TENKM;

    @Column(name = "SOTIENKM")
    private Double SOTIENKM;
    
    @Column(name = "NGAYBD")
    private Double NGAYBD;
    
    @Column(name = "NGAYKT")
    private Date NGAYKT;
    
    @Column(name = "TRANGTHAI")
    private Integer TRANGTHAI;
}

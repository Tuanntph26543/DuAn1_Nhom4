package com.poly.it17323.domainmodel;

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
    private Integer maKM;

    @Column(name = "TENKM")
    private String tenKM;

    @Column(name = "SOTIENKM")
    private Double soTienKM;
    
    @Column(name = "NGAYBD")
    private Double ngayBD;
    
    @Column(name = "NGAYKT")
    private Date ngayKT;
    
    @Column(name = "TRANGTHAI")
    private Integer trangThai;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.nhom4.domainmodel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
//import poly.nhom4.reponse.ChucVuReponse;
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
import poly.nhom4.reponse.UserTTReponse;
import poly.nhom4.repository.USERTTRepository;
import poly.nhom4.service.UserTTService;
import poly.nhom4.service.impl.UserTTServiceIplm;

/**
 *
 * @author ACER
 */
@Table(name = "USERTT")
@Entity
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
    @JoinColumn(name = "MACV", referencedColumnName = "MACV")
    private ChucVu CHUCVU;

    @Column(name = "HOTEN")
    private String HOTEN;

    @Column(name = "GIOITINH")
    private String GIOITINH;

    @Column(name = "NAMSINH")
    private Integer NAMSINH;

    @Column(name = "DIACHI")
    private String DIACHI;

    @Column(name = "CCCD")
    private String CCCD;

    @Column(name = "SDT")
    private String SDT;

    @Column(name = "TAIKHOAN")
    private String TAIKHOAN;

    @Column(name = "MATKHAU")
    private String MATKHAU;

    @Column(name = "TRANGTHAI")
    private Integer TRANGTHAI;

//    public static void main(String[] args) {
//        USERTTRepository userRP = new USERTTRepository();
////        List<UserTT> lst = userRP.getAll();
////        for (UserTT x : lst) {
////            x.toString();
////            System.out.println(x.toString());
////        }
//        UserTTService service = new UserTTServiceIplm();
//        List<UserTT> lists = userRP.getAll();
//        // B2: convert list từ reposotory sang list response
//        List<UserTTReponse> lst = new ArrayList<>();
////        return lists.stream().map(UserTTReponse::new).collect(Collectors.toList());
//        for (UserTT userDomain : lists) {
//            UserTTReponse y = new UserTTReponse(userDomain);
//            lst.add(y);
//        }
//        for (UserTTReponse x : lst) {
//            System.out.println(x.toString());
//        }
//    }
}

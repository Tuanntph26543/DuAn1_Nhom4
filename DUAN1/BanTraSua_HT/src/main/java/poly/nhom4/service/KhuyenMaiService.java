/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.nhom4.service;

import java.util.List;
import poly.nhom4.reponse.KhuyenMaiReponse;

/**
 *
 * @author Admin
 */
public interface KhuyenMaiService {

    List<KhuyenMaiReponse> getAll();

    KhuyenMaiReponse KMGetOne(Integer ma);

    String add(KhuyenMaiReponse km);

    String update(KhuyenMaiReponse km);

    String delete(KhuyenMaiReponse km);

}

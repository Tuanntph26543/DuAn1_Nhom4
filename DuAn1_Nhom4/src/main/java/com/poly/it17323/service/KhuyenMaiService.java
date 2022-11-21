/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.service;

import com.poly.it17323.domainmodel.KhuyenMai;
import com.poly.it17323.reponse.KhuyenMaiReponse;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface KhuyenMaiService {

    List<KhuyenMaiReponse> getAll();

    KhuyenMaiReponse KMGetOne(Integer ma);

    String add(KhuyenMai km);

    String update(KhuyenMai km);

    String delete(KhuyenMai km);
    
}

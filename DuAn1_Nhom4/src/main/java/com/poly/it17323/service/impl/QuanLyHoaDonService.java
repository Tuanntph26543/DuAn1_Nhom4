/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.service.impl;

import com.poly.it17323.domalmodel.HoaDon;
import com.poly.it17323.repository.HoaDonRepository;
import com.poly.it17323.service.IQuanLyHoaDonService;
import com.poly.it17323.viewmodel.HoaDonReponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class QuanLyHoaDonService implements IQuanLyHoaDonService{
    private HoaDonRepository HoaDonRepository = new HoaDonRepository();
    
    @Override
    public List<HoaDonReponse> getAllHoaDon() {
        List<HoaDon> lstChucVu = HoaDonRepository.getAll();
        List<HoaDonReponse> reponses = new ArrayList<>();
        for (HoaDon hoaDon : lstChucVu) {
            HoaDonReponse hoaDonReponse = new HoaDonReponse(hoaDon);
            reponses.add(hoaDonReponse);
        }
        return reponses;
    }
    
    public static void main(String[] args) {
        List<HoaDonReponse> lst = new QuanLyHoaDonService().getAllHoaDon();
        for (HoaDonReponse hoaDonReponse : lst) {
            System.out.println(hoaDonReponse.toString());
        }
    }
}

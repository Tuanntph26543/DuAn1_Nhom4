/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.service.impl;

import com.poly.it17323.domalmodel.ChucVu;
import com.poly.it17323.repository.ChucVuRepository;
import com.poly.it17323.service.IQuanLyChucVuService;
import com.poly.it17323.viewmodel.ChucVuReponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class QuanLyChucVuService implements IQuanLyChucVuService {

    private ChucVuRepository chucVuRepository = new ChucVuRepository();
    @Override
    public List<ChucVuReponse> getAllChucVu() {
        List<ChucVu> lstChucVu = chucVuRepository.getAll();
        List<ChucVuReponse> reponses = new ArrayList<>();
        for (ChucVu chucVu : lstChucVu) {
            ChucVuReponse chucVuReponse = new ChucVuReponse(chucVu);
            reponses.add(chucVuReponse);
        }
        return reponses;
    }
}

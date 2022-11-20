/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.service.impl;

import com.poly.it17323.domainmodel.NguyenLieu;
import com.poly.it17323.response.NguyenLieuResponse;
import com.poly.it17323.repository.NguyenLieuRepository;
import com.poly.it17323.service.QuanLyNguyenLieuService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 */
public class QuanLyNguyenLieuServiceImpl implements QuanLyNguyenLieuService {

    private NguyenLieuRepository nguyenLieuRepository = new NguyenLieuRepository();

    @Override
    public List<NguyenLieuResponse> getAllNguyenLieu() {
        List<NguyenLieu> lists = nguyenLieuRepository.getAll();
        List<NguyenLieuResponse> responses = new ArrayList<>();
        for (NguyenLieu x : lists) {
            NguyenLieuResponse nguyenLieuResponse = new NguyenLieuResponse(x);
            responses.add(nguyenLieuResponse);
        }
        return responses;
    }
    public static void main(String[] args) {
        List<NguyenLieuResponse> lists = new QuanLyNguyenLieuServiceImpl().getAllNguyenLieu();
        for (NguyenLieuResponse x : lists) {
            System.out.println(x.toString());
        }
    }
}

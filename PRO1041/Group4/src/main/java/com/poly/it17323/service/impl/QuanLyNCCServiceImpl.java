/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.service.impl;

import com.poly.it17323.domainmodel.NhaCungCap;
import com.poly.it17323.response.NhaCungCapResponse;
import com.poly.it17323.repository.NhaCungCapRepository;
import com.poly.it17323.service.QuanLyNCCService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 */
public class QuanLyNCCServiceImpl implements QuanLyNCCService {

    private NhaCungCapRepository nhaCungCapRepository = new NhaCungCapRepository();

    @Override
    public List<NhaCungCapResponse> getAllNCC() {
        List<NhaCungCap> lists = nhaCungCapRepository.getAll();
        List<NhaCungCapResponse> responses = new ArrayList<>();
        for (NhaCungCap ncc : lists) {
            NhaCungCapResponse nhaCungCapResponse = new NhaCungCapResponse(ncc);
            responses.add(nhaCungCapResponse);
        }
        return responses;
    }
    public static void main(String[] args) {
        List<NhaCungCapResponse> lists = new QuanLyNCCServiceImpl().getAllNCC();
        for (NhaCungCapResponse x : lists) {
            System.out.println(x.toString());
        }
    }
}

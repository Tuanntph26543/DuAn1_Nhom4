/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.service.impl;

import com.poly.it17323.domainmodel.Ban;
import com.poly.it17323.response.BanResponse;
import com.poly.it17323.repository.BanRepository;
import com.poly.it17323.service.QuanLyBanService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author My PC
 */
public class QuanLyBanServiceImpl implements QuanLyBanService {

    private BanRepository banRepository = new BanRepository();

    @Override
    public List<BanResponse> getAllBan() {
        List<Ban> lists = banRepository.getAll();
        List<BanResponse> responses = new ArrayList<>();
        for (Ban ban : lists) {
            BanResponse banResponse = new BanResponse(ban);
            responses.add(banResponse);
        }
        return responses;
    }
    public static void main(String[] args) {
        List<BanResponse> lists = new QuanLyBanServiceImpl().getAllBan();
        for (BanResponse x : lists) {
            System.out.println(x.toString());
        }
    }
}

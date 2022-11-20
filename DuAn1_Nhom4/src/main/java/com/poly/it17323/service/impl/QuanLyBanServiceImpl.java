/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.service.impl;

import com.poly.it17323.domainmodel.Ban;
import com.poly.it17323.reponse.BanReponse;
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
    public List<BanReponse> getAllBan() {
        List<Ban> lists = banRepository.getAll();
        List<BanReponse> responses = new ArrayList<>();
        for (Ban ban : lists) {
            BanReponse banResponse = new BanReponse(ban);
            responses.add(banResponse);
        }
        return responses;
    }
    public static void main(String[] args) {
        List<BanReponse> lists = new QuanLyBanServiceImpl().getAllBan();
        for (BanReponse x : lists) {
            System.out.println(x.toString());
        }
    }
}

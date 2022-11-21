/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.service.impl;

import com.poly.it17323.domainmodel.KhuyenMai;
import com.poly.it17323.reponse.KhuyenMaiReponse;
import com.poly.it17323.repository.KhuyenMaiRepository;
import com.poly.it17323.service.KhuyenMaiService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class KhuyenMaiServiceImpl implements KhuyenMaiService {

    private KhuyenMaiRepository repo = new KhuyenMaiRepository();

    @Override
    public List<KhuyenMaiReponse> getAll() {
        List<KhuyenMai> lists = repo.getAll();
//        List<KhuyenMaiReponse> reponses = new ArrayList<>();
//        for (KhuyenMai km : lists) {
//            KhuyenMaiReponse reponse = new KhuyenMaiReponse(km);
//            reponses.add(reponse);
//        }
//        return reponses;
        return lists.stream().map(KhuyenMaiReponse::new).collect(Collectors.toList());
    }

    @Override
    public KhuyenMaiReponse KMGetOne(Integer ma) {
        return null;

    }

    @Override
    public String add(KhuyenMai km) {
        boolean add = repo.add(km);
        if (add) {
            return "Thanh cong";
        } else {
            return "That bai";
        }
    }

    @Override
    public String update(KhuyenMai km) {
        boolean update = repo.update(km);
        if (update) {
            return "Thanh cong";
        } else {
            return "That bai";
        }
    }

    @Override
    public String delete(KhuyenMai km) {
        boolean delete = repo.delete(km);
        if (delete) {
            return "Thanh cong";
        } else {
            return "That bai";
        }
    }

//     public static void main(String[] args) {
//        List<KhuyenMaiReponse> lists = new KhuyenMaiServiceImpl().getAll();
//        for (KhuyenMaiReponse list : lists) {
//            System.out.println(list.toString());
//        }
//    }
}

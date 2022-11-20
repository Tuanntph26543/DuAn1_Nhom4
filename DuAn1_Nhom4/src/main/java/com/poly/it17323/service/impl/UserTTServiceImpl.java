/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.service.impl;

import com.poly.it17323.domainmodel.UserTT;
import com.poly.it17323.reponse.ChucVuReponse;
import com.poly.it17323.reponse.UserTTReponse;
import com.poly.it17323.repository.UserTTRepository;
import com.poly.it17323.service.UserTTService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author FPT Shop
 */
public class UserTTServiceImpl implements UserTTService {

    private UserTTRepository userTTRepository = new UserTTRepository();

    @Override
    public List<UserTTReponse> getAllUserTTs() {
        // B1: lấy list từ repository
        List<UserTT> lists = userTTRepository.getAll();
        // B2: convert list từ reposotory sang list response
        List<UserTTReponse> lst = new ArrayList<>();
//        return lists.stream().map(UserTTReponse::new).collect(Collectors.toList());
        for (UserTT userDomain : lists) {
            UserTTReponse y = new UserTTReponse(userDomain);
            lst.add(y);
        }
        return lst;
    }

    @Override
    public UserTTReponse dangNhap(String taiKhoanNhap, String matKhauNhap) {
        List<UserTT> lists = userTTRepository.getAll();
        // B2: convert list từ reposotory sang list response
//        List<UserTTReponse> lst = new ArrayList<>();
//        return lists.stream().map(UserTTReponse::new).collect(Collectors.toList());
        for (UserTT userDomain : lists) {
            if (userDomain.getTaiKhoan().equals(taiKhoanNhap) && userDomain.getMatKhau().equalsIgnoreCase(matKhauNhap)) {
                UserTTReponse y = new UserTTReponse(userDomain);
                return y;
            } else {
                return null;
            }

        }
        return null;

    }

    @Override
    public boolean updateUser(UserTTReponse userReponse) {
        try {
            UserTT user = new UserTT();
            user.setCccd(userReponse.getCccd());
            user.setChucVu(userReponse.getChucVu());
            user.setDiaChi(userReponse.getDiaChi());
            user.setGioiTinh(userReponse.getGioiTinh());
            user.setHoTen(userReponse.getHoTen());
            user.setMatKhau(userReponse.getMatKhau());
            user.setNamSinh(userReponse.getNamSinh());
            user.setSdt(userReponse.getSdt());
            user.setTaiKhoan(userReponse.getTaiKhoan());
            user.setTrangThai(1);
            userTTRepository.update(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean insertUser(UserTTReponse userReponse) {
        UserTT user = new UserTT();
            user.setMaNV(null);
            user.setCccd(userReponse.getCccd());
            user.getChucVu().setMaCV(userReponse.getChucVu().getMaCV());
            user.setDiaChi(userReponse.getDiaChi());
            user.setGioiTinh(userReponse.getGioiTinh());
            user.setHoTen(userReponse.getHoTen());
            user.setMatKhau(userReponse.getMatKhau());
            user.setNamSinh(userReponse.getNamSinh());
            user.setSdt(userReponse.getSdt());
            user.setTaiKhoan(userReponse.getTaiKhoan());
            user.setTrangThai(1);
            userTTRepository.add(user);
            return true;
    }
}



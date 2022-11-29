/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.nhom4.service.impl;

import java.util.ArrayList;
import java.util.List;
import poly.nhom4.domainmodel.KhachHang;
import poly.nhom4.reponse.KhachHangReponse;
import poly.nhom4.repository.KhachHangRepository;
import poly.nhom4.service.KhachHangService;

/**
 *
 * @author ACER
 */
public class KhachHangServiceIplm implements KhachHangService {

    private final KhachHangRepository khachHangRepository;

    public KhachHangServiceIplm() {
        khachHangRepository = new KhachHangRepository();
    }

    @Override
    public String getTenKhBySdt(String sdt) {
        return khachHangRepository.getTenKhBySdt(sdt);
    }

    @Override
    public KhachHang getKhBySdt(String sdt) {
        return khachHangRepository.getKhBySdt(sdt);
    }

    @Override
    public List<KhachHangReponse> getAll() {
        List<KhachHang> lists = khachHangRepository.getAll();
        List<KhachHangReponse> reponses = new ArrayList<>();
        for (KhachHang kh : lists) {
            KhachHangReponse reponse = new KhachHangReponse(kh);
            reponses.add(reponse);
        }
        return reponses;
    }

    @Override
    public String add(KhachHangReponse kh) {
        khachHangRepository.add(new KhachHang(kh.getTenKH(), kh.getDiaChi(), kh.getSdt()));
        if (kh != null) {
            return "Thành công";
        } else {
            return "Thất bại";
        }
    }

    @Override
    public String update(KhachHangReponse kh) {
        khachHangRepository.update(new KhachHang(kh.getMaKH(), kh.getTenKH(), kh.getDiaChi(), kh.getSdt()));
        if (kh != null) {
            return "Thành công";
        } else {
            return "Thất bại";
        }
    }

    @Override
    public String delete(KhachHangReponse kh) {
        KhachHang k = new KhachHang();
        k.setMAKH(kh.getMaKH());
        khachHangRepository.delete(k);
        if (k != null) {
            return "Thành công";
        } else {
            return "Thất bại";
        }
    }
       
}

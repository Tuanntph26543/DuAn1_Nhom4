/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.service;

import com.poly.it17323.reponse.BanReponse;
import java.util.List;

/**
 *
 * @author My PC
 */
public interface QuanLyBanService {

    List<BanReponse> getAllBan();
    
    boolean add(BanReponse banReponse);
    
    boolean update(BanReponse banReponse);
    
    boolean delete(BanReponse banReponse);
}

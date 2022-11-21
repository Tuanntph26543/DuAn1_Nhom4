/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.it17323.service;

import com.poly.it17323.reponse.ChucVuReponse;
import com.poly.it17323.reponse.UserTTReponse;
import java.util.List;

/**
 *
 * @author FPT Shop
 */
public interface UserTTService {
    List<UserTTReponse> getAllUserTTs();
    
    UserTTReponse dangNhap(String taiKhoanNhap, String matKhauNhap);

    boolean insertUser(UserTTReponse userReponse);

    boolean updateUser(UserTTReponse userReponse);


}

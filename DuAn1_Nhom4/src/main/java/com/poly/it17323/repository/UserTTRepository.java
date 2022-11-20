/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.repository;

import com.poly.it17323.domainmodel.UserTT;
import com.poly.it17323.hirbernateconfig.HirbernateUtil;
import com.poly.it17323.reponse.UserTTReponse;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author FPT Shop
 */
public class UserTTRepository {
    private Session session = HirbernateUtil.getFACTORY().openSession();
    private String fromTable = "From UserTT";
    
    public List<UserTT> getAll(){
        Query query = session.createQuery(fromTable, UserTT.class);
        List<UserTT> lst = query.getResultList();
        return lst;
    }
    
    public UserTT dangNhap(String taikhoan){
        String sql = fromTable + " where taikhoan =: taikhoan ";
        Query query= session.createQuery(fromTable,UserTT.class);
        query.setParameter("TaiKhoan", taikhoan);
//        query.setParameter("MATKHAU", matKhauNhap);
        //query.setParameter("1", id);
        UserTT user = (UserTT) query.getSingleResult();
        return user;
    }
    
    public Boolean add(UserTT userTT){
        Transaction transaction = null;
        try (Session session = HirbernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.save(userTT);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public Boolean update(UserTT userTT){
        Transaction transaction = null;
        try ( Session session = HirbernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(userTT);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }
        return null;
    }
    public Boolean delete(UserTT userTT){
        Transaction transaction = null;
        try (Session session = HirbernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.delete(userTT);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public static void main(String[] args) {
//        UserTT user = new UserTTRepository().add(new UserTT(Integer.SIZE, chucVu, hoTen, gioiTinh, Integer.SIZE, diaChi, cccd, sdt, taiKhoan, matKhau, Integer.BYTES));
//        for (UserTT category : list) {
//            System.out.println(category.toString());
////            System.out.println(category.getId());
//        }
        
    }
}

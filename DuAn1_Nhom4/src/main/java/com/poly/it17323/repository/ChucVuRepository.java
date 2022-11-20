/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.repository;

import com.poly.it17323.domalmodel.ChucVu;
import com.poly.it17323.hibernateConfig.HirbernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author nguye
 */
public class ChucVuRepository {
    private String fromTable = "From ChucVu";
    private Session session = HirbernateUtil.getFACTORY().openSession();
    
    public List<ChucVu> getAll(){
        Query query = session.createQuery(fromTable, ChucVu.class);
        List<ChucVu> lstChucVu = query.getResultList();
        return lstChucVu;
    }
    
    public ChucVu getOne(Integer maCV){
        String sql = fromTable + "where macv = :macv";
        Query query = session.createQuery(fromTable, ChucVu.class);
        query.setParameter("macv", maCV);
        ChucVu chucVu = (ChucVu) query.getSingleResult();
        return chucVu;
    }
    
    public Boolean add(ChucVu chucVu){
        Transaction transaction = null;
        try (Session session = HirbernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.save(chucVu);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public Boolean update(ChucVu chucVu){
        Transaction transaction = null;
        try (Session session = HirbernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.saveOrUpdate(chucVu);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public Boolean delete(ChucVu chucVu){
        Transaction transaction = null;
        try (Session session = HirbernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.delete(chucVu);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public static void main(String[] args) {
        List<ChucVu> lst = new ChucVuRepository().getAll();
        for (ChucVu chucVu : lst) {
            System.out.println(chucVu.toString());
        }
    }
}

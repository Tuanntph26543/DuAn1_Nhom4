/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.repository;

import com.poly.it17323.domainmodel.KhuyenMai;
import com.poly.it17323.hirbernateconfig.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.util.ObjectUtils;

/**
 *
 * @author Admin
 */
public class KhuyenMaiRepository {

    Session session = HibernateUtil.getFACTORY().openSession();
    private String fromTable = "from KhuyenMai"; // from domainmodel chứ trong phải table trong sql

    public List<KhuyenMai> getAll() {
        try {
            Query query = session.createQuery(fromTable, KhuyenMai.class);
            List<KhuyenMai> list = query.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public KhuyenMai getOne(Integer ma) {
        String sql = fromTable + "WHERE ma = :MAKM";
        Query query = session.createQuery(sql, KhuyenMai.class);
        query.setParameter("MAKM", ma);
        KhuyenMai khuyenMai = (KhuyenMai) query.getSingleResult();
        return khuyenMai;

    }

    public Boolean add(KhuyenMai km) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(km);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

//    public Boolean update(KhuyenMai km) {
//        Transaction transaction = null;
//        try (Session session = HibernateUtil.getFACTORY().openSession()) {
//            transaction = session.beginTransaction();
//            session.saveOrUpdate(km);
//            transaction.commit();
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace(System.out);
//        }
//        return null;
//        try {
//            KhuyenMai km1 = session.get(KhuyenMai.class, maKM);
//            km1.setNgayBD(km1.getNgayBD());
//            km1.setNgayKT(km1.getNgayKT());
//            km1.setSoTienKM(km1.getSoTienKM());
//            km1.setTenKM(km1.getTenKM());
//            km1.setTrangThai(km1.getTrangThai());
//            session.getTransaction().begin();
//            session.save(km1);
//            session.getTransaction().commit();
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
    public Boolean update(KhuyenMai km) {
        try (Session session = HibernateUtil.getFACTORY().openSession();) {
            session.getTransaction().begin();
            session.saveOrUpdate(km);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return false;
        }
    }

    public Boolean delete(KhuyenMai km) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(km);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
//        KhuyenMai km = new KhuyenMai();
//        km.setTenKM("cvf");
//        new KhuyenMaiRepository().update(km, 1);
    }
}

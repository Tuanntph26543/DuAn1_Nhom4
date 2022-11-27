/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.repository;

import com.poly.it17323.domalmodel.HoaDon;
import com.poly.it17323.hibernateConfig.HirbernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author nguye
 */
public class HoaDonRepository {

    private String fromTable = "From HoaDon";
    private Session session = HirbernateUtil.getFACTORY().openSession();

    public List<HoaDon> getAll() {
        Query query = session.createQuery(fromTable, HoaDon.class);
        List<HoaDon> lstHoaDon = query.getResultList();
        return lstHoaDon;
    }

    public HoaDon getOne(Integer maHD) {
        String sql = fromTable + "where mahd = :mahd";
        Query query = session.createQuery(fromTable, HoaDon.class);
        query.setParameter("macv", maHD);
        HoaDon hoaDon = (HoaDon) query.getSingleResult();
        return hoaDon;
    }

    public Boolean add(HoaDon hoaDon) {
        Transaction transaction = null;
        try ( Session session = HirbernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(hoaDon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(HoaDon hoaDon) {
        Transaction transaction = null;
        try ( Session session = HirbernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(hoaDon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(HoaDon hoaDon) {
        Transaction transaction = null;
        try ( Session session = HirbernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(hoaDon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        List<HoaDon> lst = new HoaDonRepository().getAll();
        for (HoaDon hoaDon : lst) {
            System.out.println(hoaDon.toString());
        }
    }
}

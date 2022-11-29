/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.nhom4.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import poly.nhom4.domainmodel.KhachHang;
import poly.nhom4.hibernateconfig.HibernateUtil;

/**
 *
 * @author ACER
 */
public class KhachHangRepository {

    Session session = HibernateUtil.getFACTORY().openSession();
    private String fromTable = "from KhachHang";
    
    public String getTenKhBySdt(String sdt) {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("From KhachHang Where SDT =: SDT");// truy vấn trên entity(HQL)
        query.setParameter("SDT", sdt);
        KhachHang kh = (KhachHang) query.getSingleResult();
        String list1 = kh.getTENKH();
        return list1;
    }      

    public KhachHang getKhBySdt(String sdt) {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("From KhachHang Where SDT =: SDT");// truy vấn trên entity(HQL)
        query.setParameter("SDT", sdt);
        KhachHang kh = (KhachHang) query.getSingleResult();
        return kh;
    }

    public List<KhachHang> getAll() {
        try {
            javax.persistence.Query query = session.createQuery(fromTable, KhachHang.class);
            List<KhachHang> list = query.getResultList();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean add(KhachHang kh) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(kh);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(KhachHang kh) {
        try (Session session = HibernateUtil.getFACTORY().openSession();) {
            session.getTransaction().begin();
            session.saveOrUpdate(kh);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return false;
        }
    }

    public Boolean delete(KhachHang kh) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(kh);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}

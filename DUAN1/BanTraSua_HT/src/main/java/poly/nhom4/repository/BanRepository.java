/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.nhom4.repository;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import poly.nhom4.domainmodel.Ban;
import poly.nhom4.hibernateconfig.HibernateUtil;

/**
 *
 * @author ACER
 */
public class BanRepository {
    public Ban getBanByMa(int ma) {
        Session session = HibernateUtil.getFACTORY().openSession();
        Query query = session.createQuery("From Ban Where MABAN =: MABAN");// truy vấn trên entity(HQL)
        query.setParameter("MABAN", ma);
        Ban hd = (Ban) query.getSingleResult();
        return hd;
    }
    
    public List<Ban> getAll() {
        Session session = HibernateUtil.getFACTORY().openSession();
        String fromTable = "FROM Ban"; // HQL
        Query query = session.createQuery(fromTable, Ban.class);
        List<Ban> lists = query.getResultList();
        return lists;
    }

    public Boolean add(Ban ban) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(ban);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean update(Ban ban) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.update(ban);
            transaction.commit();
            getAll();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean delete(Ban ban) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(ban);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.repository;

import com.poly.it17323.domainmodel.Ban;
import com.poly.it17323.hibernateconfig.HibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author My PC
 */
public class BanRepository {

    private Session session = HibernateUtil.getFACTORY().openSession();

    private String fromTable = "FROM BAN"; // HQL

    public List<Ban> getAll() {
        Query query = session.createQuery(fromTable, Ban.class);
        List<Ban> lists = query.getResultList();
        return lists;
    }

//    public Ban getOne(Long id) {
//        String sql = fromTable + "WHERE id =:id";
//        Query query = session.createQuery(sql, Ban.class);
//        query.setParameter("id", id);
//        Ban ban = (Ban) query.getSingleResult();
//        return ban;
//    }

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
            session.saveOrUpdate(ban);
            transaction.commit();
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

    public static void main(String[] args) {
        List<Ban> lists = new BanRepository().getAll();
        for (Ban x : lists) {
            System.out.println(x.toString());
        }
    }
}

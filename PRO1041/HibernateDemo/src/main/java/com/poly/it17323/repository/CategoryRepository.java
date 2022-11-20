/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.repository;

import com.poly.it17323.domainmodel.Category;
import com.poly.it17323.hibernateconfig.HibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author My PC
 */
public class CategoryRepository {

    private Session session = HibernateUtil.getFACTORY().openSession();

    private String fromTable = "FROM Category"; // HQL

    public List<Category> getAll() {
        Query query = session.createQuery(fromTable, Category.class);
        List<Category> lists = query.getResultList();
        return lists;
    }

    public Category getOne(Long id) {
        String sql = fromTable + "WHERE id =:id";
        Query query = session.createQuery(sql, Category.class);
        query.setParameter("id", id);
        Category category = (Category) query.getSingleResult();
        return category;
    }

    public Boolean add(Category category) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(category);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public Boolean update(Category category) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(category);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public Boolean delete(Category category) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(category);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        List<Category> lists = new CategoryRepository().getAll();
        for (Category x : lists) {
            System.out.println(x.toString());
        }
    }
}

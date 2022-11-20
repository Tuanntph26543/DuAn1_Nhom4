/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.repository;

import com.poly.it17323.domainmodel.Category;
import com.poly.it17323.domainmodel.Product;
import com.poly.it17323.hibernateconfig.HibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author My PC
 */
public class ProductRepository {

    private String fromTable = "FROM Product";

    private Session session = HibernateUtil.getFACTORY().openSession();

    public List<Product> getAll() {
        Query query = session.createQuery(fromTable, Product.class);
        List<Product> lists = query.getResultList();
        return lists;
    }
    
}

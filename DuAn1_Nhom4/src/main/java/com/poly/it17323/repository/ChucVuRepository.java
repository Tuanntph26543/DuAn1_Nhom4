/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.repository;

import com.poly.it17323.domainmodel.ChucVu;
import com.poly.it17323.hirbernateconfig.HirbernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author FPT Shop
 */
public class ChucVuRepository {
    private Session session = HirbernateUtil.getFACTORY().openSession();
    private String fromTable = "From ChucVu";
    
    public List<ChucVu> getAll(){
        Query query = session.createQuery(fromTable, ChucVu.class);
        List<ChucVu> lst = query.getResultList();
        return lst;
    }
}

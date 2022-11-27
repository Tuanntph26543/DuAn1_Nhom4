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
import poly.nhom4.domainmodel.UserTT;
import poly.nhom4.hibernateconfig.HibernateUtil;
//import poly.nhom4.hibernateconfig.HirbernateUtil;

/**
 *
 * @author ACER
 */
public class USERTTRepository {
    private Session session = HibernateUtil.getFACTORY().openSession();
    private String fromTable = "From UserTT";
    
     public UserTT getUSerByMaNV(int maNV) {
        Session x = HibernateUtil.getFACTORY().openSession();
        Query query = x.createQuery("From USERTT Where MANV =: MANV");// truy vấn trên entity(HQL)
        query.setParameter("MANV", maNV);
        UserTT nv = (UserTT) query.getSingleResult();
        return nv;
    }
     
     public List<UserTT> getAll(){
        javax.persistence.Query query = session.createQuery(fromTable, UserTT.class);
        List<UserTT> lst = query.getResultList();
        return lst;
    }
    
    public UserTT dangNhap(String taikhoan){
        String sql = fromTable + " where taikhoan =: taikhoan ";
        javax.persistence.Query query= session.createQuery(fromTable,UserTT.class);
        query.setParameter("TaiKhoan", taikhoan);
//        query.setParameter("MATKHAU", matKhauNhap);
        //query.setParameter("1", id);
        UserTT user = (UserTT) query.getSingleResult();
        return user;
    }
    
    public Boolean add(UserTT userTT){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.save(userTT);
            transaction.commit();
            return true;
        } catch (Exception e) {
//            e.printStackTrace(System.out);
                return null;
        }
    }
    public Boolean update(UserTT userTT){
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.update(userTT);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public Boolean delete(UserTT userTT){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getFACTORY().openSession()){
            transaction = session.beginTransaction();
            session.delete(userTT);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}

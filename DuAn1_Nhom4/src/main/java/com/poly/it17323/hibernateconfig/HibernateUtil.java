/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.it17323.hibernateconfig;

//import com.poly.it17323.domainmodel.Category;
//import com.poly.it17323.domainmodel.Product;
import com.poly.it17323.domainmodel.Ban;
import com.poly.it17323.domainmodel.NguyenLieu;
import com.poly.it17323.domainmodel.NhaCungCap;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author My PC
 */
public class HibernateUtil {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=QLBANTS");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "28102003");
        properties.put(Environment.SHOW_SQL, "true");

        conf.setProperties(properties);
        conf.addAnnotatedClass(Ban.class);
        conf.addAnnotatedClass(NguyenLieu.class);
        conf.addAnnotatedClass(NhaCungCap.class);


        ServiceRegistry registry = (ServiceRegistry) new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory((org.hibernate.service.ServiceRegistry) registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        getFACTORY();
    }
}

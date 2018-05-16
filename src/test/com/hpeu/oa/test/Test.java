package com.hpeu.oa.test;

import com.hpeu.oa.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args){
        //加载sessionFactory
        final StandardServiceRegistry registry =  new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        //获取session对象
        Session session = sessionFactory.openSession();//不会关闭资源
        session.beginTransaction();
        User user = new User();
        session.save(user);
        session.getTransaction().commit();


    }
}

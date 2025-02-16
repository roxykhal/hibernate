package com.khalilifar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setSage(13);
        s1.setRollNo(4);
        s1.setsName("Rosie");

        Configuration cfg = new Configuration();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        session.save(s1);

        System.out.println(s1);
    }
}

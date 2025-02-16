package com.khalilifar;

import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setSage(13);
        s1.setRollNo(4);
        s1.setsName("Rosie");

        Session session = null;
        session.save(s1);

        System.out.println(s1);
    }
}

package com.mapping.collection.set;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DemoSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SessionFactory sf=new Configuration().configure().buildSessionFactory();
     Session s=sf.openSession();
     Transaction tx=s.beginTransaction();
     Book b=new Book();
     b.setBk_name("AAAA");
     b.setPublisher("PPPP");
     Set<String> s1=new HashSet<String>();
     s1.add("XXXX");
     s1.add("YYYY");
     s1.add("ZZZZ");
     b.setAuthors(s1);
     s.persist(b);
     tx.commit();
     
     Query q=s.createQuery("from Book");
     System.out.println(q.list());
     System.out.println("success");
     
	}

}

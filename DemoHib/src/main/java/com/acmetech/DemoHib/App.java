package com.acmetech.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Alien acmetech = new Alien();
        acmetech.setAid(101);
        acmetech.setAname("john");
        acmetech.setColor("neon");
        
        Configuration con = new Configuration();
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        session.save(acmetech);
    }
}

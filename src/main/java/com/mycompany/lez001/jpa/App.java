/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez001.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tss
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pun");
        EntityManager em = emf.createEntityManager();
        
        Messaggio msg = new Messaggio("pranzo ...");
        
        em.getTransaction().begin();
        em.merge(msg);
        em.getTransaction().commit();
        
    }
    
}

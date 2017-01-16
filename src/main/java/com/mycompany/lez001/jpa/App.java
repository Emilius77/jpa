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
        
        Messaggio msg = new Messaggio("pranzo ...");  //equivale a ciò che vogliamo inserire come record
        
        em.getTransaction().begin();                    //apre la connessione al db
        //em.merge(msg);                                  //scrive il nostro messaggio sul db
        Messaggio finded = em.find(Messaggio.class, 1l);
        
        System.out.println(finded);
        
        finded.setTesto(finded.getTesto() + " adesso!!!");
        
        em.merge(finded);
        
        em.getTransaction().commit();                   //salva il nostro mnessaggio sul db
        
    }
    
}

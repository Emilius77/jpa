/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez001.jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author tss
 * 
 * Esercitazione con db
 * Abbiamo creato sotto MySql un db che si chiama jpa ed un utente: jpa con pwd: jpa
 */

@Entity                             //si aggiunge in tutte le classi che vanno usate con i db 
@Table(name = "t_messaggio")        //(la nostra classe Messaggio del progetto java diventerà la tabella t_messaggio del nostro db)
public class Messaggio implements Serializable {

    public Messaggio() {

    }

    public Messaggio(String testo) {
        this.testo = testo;
    }
    

    @Id
    @GeneratedValue             //equivale all'auto incremento del db
    private int id;

    private String testo;       //di default prendo il tipo Varchar con lunghezza 255 caratteri

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Messaggio other = (Messaggio) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Messaggio{" + "id=" + id + ", testo=" + testo + '}';
    }

    
}

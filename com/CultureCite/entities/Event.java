/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CultureCite.entities;

import java.util.Date;

/**
 *
 * @author Mejri Dorra
 */
public class Event {
    private int id ;
    private Date dateDebut;
    private String image;
    private String lieu;
    private String libelle;
    private int nombreTicket;
    private Date dateFin;
    private double prixUnitaire;
    private String type;

    public Event(Date dateDebut, String lieu, String libelle, int nombreTicket, Date dateFin, double prixUnitaire, String type,String image) {
        this.dateDebut = dateDebut;
        this.lieu = lieu;
        this.libelle = libelle;
        this.nombreTicket = nombreTicket;
        this.dateFin = dateFin;
        this.prixUnitaire = prixUnitaire;
        this.type = type;
        this.image= image;
    }

    public Event(int id, Date dateDebut, String lieu, String libelle, int nombreTicket, Date dateFin, double prixUnitaire, String type,String image) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.lieu = lieu;
        this.libelle = libelle;
        this.nombreTicket = nombreTicket;
        this.dateFin = dateFin;
        this.prixUnitaire = prixUnitaire;
        this.type = type;
        this.image= image;
    }
    

    public Event() {
    }

    public Event(java.sql.Date date, String string, String string0, int aInt, java.sql.Date date0, double aDouble, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "id=" + id + ", dateDebut=" + dateDebut 
                + ", lieu=" + lieu + ", libelle=" + libelle 
                + ", nombreTicket=" + nombreTicket 
                + ", dateFin=" + dateFin + ", prixUnitaire=" 
                + prixUnitaire + ", type=" + type + " , image= "+ image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNombreTicket() {
        return nombreTicket;
    }

    public void setNombreTicket(int nombreTicket) {
        this.nombreTicket = nombreTicket;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   }

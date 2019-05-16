/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CultureCite.entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ELYES
 */
public class User {
        private int id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String photo;
    private int telephone;
    private Date naissance;
    private String typeProfil;
    private String sexe;
    private String interets;
    private String CarteProf;
    private String Competance;
    private String specialite;
    private String token;

    public User()
    {
        
    }

    public User(int id, String nom, String prenom, String email, String password, String photo, int telephone, Date naissance, String typeProfil, String sexe, String interets, String CarteProf, String Competance, String specialite,String token) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.photo = photo;
        this.telephone = telephone;
        this.naissance = naissance;
        this.typeProfil = typeProfil;
        this.sexe = sexe;
        this.interets = interets;
        this.CarteProf = CarteProf;
        this.Competance = Competance;
        this.specialite = specialite;
        this.token=token;
    }

  

    public User(String nom, String prenom, String email, String password, String token, String photo, int telephone, Date naissance, String typeProfil, String sexe, String interets) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.naissance = naissance;
        this.typeProfil = typeProfil;
        this.sexe = sexe;
        this.interets = interets;
        this.photo=photo;
        this.token=token;
    }

   

   

    public User(String nom, String prenom, String email, String password, String token, String photo, int telephone, Date naissance, String typeProfil, String sexe, String interets, String CarteProf, String Competance, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.naissance = naissance;
        this.typeProfil = typeProfil;
        this.sexe = sexe;
        this.interets = interets;
        this.CarteProf = CarteProf;
        this.Competance = Competance;
        this.specialite = specialite;
        this.token=token;
        this.photo=photo;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public String getTypeProfil() {
        return typeProfil;
    }

    public void setTypeProfil(String typeProfil) {
        this.typeProfil = typeProfil;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getInterets() {
        return interets;
    }

    public void setInterets(String interets) {
        this.interets = interets;
    }

    public String getCarteProf() {
        return CarteProf;
    }

    public void setCarteProf(String CarteProf) {
        this.CarteProf = CarteProf;
    }

    public String getCompetance() {
        return Competance;
    }

    public void setCompetance(String Competance) {
        this.Competance = Competance;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", password=" + password + ", photo=" + photo + ", telephone=" + telephone + ", naissance=" + naissance + ", typeProfil=" + typeProfil + ", sexe=" + sexe + ", interets=" + interets + ", CarteProf=" + CarteProf + ", Competance=" + Competance + ", specialite=" + specialite + '}';
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

  

   
}

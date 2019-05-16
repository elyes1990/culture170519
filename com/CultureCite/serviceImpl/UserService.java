/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CultureCite.serviceImpl;
import com.CultureCite.entities.User;
import com.CultureCite.utils.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ELYES
 */
public class UserService {
        Connection cnx = DatabaseConnection.getInstance().getConnection();
        
        public void insertUtilisateur(User u) {
        try
        {
            String query = "INSERT INTO users (nom, prenom, email, password, telephone, naissance, typeProfil, sexe, photo, interets, token) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = cnx.prepareStatement(query);
            statement.setString(1, u.getNom());
            statement.setString(2, u.getPrenom());
            statement.setString(3, u.getEmail());
            statement.setString(4, u.getPassword());
            statement.setInt(5, u.getTelephone());
            statement.setDate(6, new java.sql.Date(u.getNaissance().getTime()));
            statement.setString(7, u.getTypeProfil());
            statement.setString(8, u.getSexe());
            statement.setString(9, u.getPhoto());
            statement.setString(10, u.getInterets());
            statement.setString(11, u.getToken());
            statement.executeUpdate();
            System.out.println("Utilisateur ajouter avec succés");
        }catch(SQLException ex)
        {
              System.out.println("Failed")  ;      }
    }
        
    public void insertPro(User u) {
        try
        {
            String query = "INSERT INTO users (nom, prenom, email, password, telephone, naissance, typeProfil, sexe, photo, interets, token, CarteProf, Competance, specialite) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = cnx.prepareStatement(query);
            statement.setString(1, u.getNom());
            statement.setString(2, u.getPrenom());
            statement.setString(3, u.getEmail());
            statement.setString(4, u.getPassword());
            statement.setInt(5, u.getTelephone());
            statement.setDate(6, new java.sql.Date(u.getNaissance().getTime()));
            statement.setString(7, u.getTypeProfil());
            statement.setString(8, u.getSexe());
            statement.setString(9, u.getPhoto());
            statement.setString(10, u.getInterets());
            statement.setString(11, u.getToken());
            statement.setString(12, u.getCarteProf());
            statement.setString(13, u.getCompetance());
            statement.setString(14, u.getSpecialite());
            statement.executeUpdate();
            System.out.println("Artiste Profisionelle");
        }catch(SQLException ex)
        {
            System.out.println("Failed")  ;  
        }
    }
        
public User getByEmail(String email) {
                                 User u = new User();

        try{

         String query = "SELECT * FROM users WHERE email = "+"'"+email+"'";
         Statement statement = cnx.createStatement();
         ResultSet rs = statement.executeQuery(query);
         while(rs.next())
         {
             u.setId(rs.getInt(1));
             u.setNom(rs.getString(2));
             u.setPrenom(rs.getString(3));
             u.setEmail(rs.getString(4));
             u.setPassword(rs.getString(5));
             u.setTelephone(rs.getInt(6));
             u.setTypeProfil(rs.getString(7));
             u.setSexe(rs.getString(8));
             u.setPhoto(rs.getString(9));
             u.setNaissance(rs.getDate(10));
             u.setInterets(rs.getString(11));
             u.setToken(rs.getString(12));
             u.setCarteProf(rs.getString(13));
             u.setCompetance(rs.getString(14));
             u.setSpecialite(rs.getString(15));
           
         }
        }catch(SQLException ex)
        {
            System.out.println("Failed")  ;  
        }
        return u;
    }

        public User getById(int id) {
        User u = new User();

        try{

         String query = "SELECT * FROM users WHERE id = "+"'"+id+"'";
         Statement statement = cnx.createStatement();
         ResultSet rs = statement.executeQuery(query);
         while(rs.next())
         {
             u.setId(rs.getInt(1));
             u.setNom(rs.getString(2));
             u.setPrenom(rs.getString(3));
             u.setEmail(rs.getString(4));
             u.setPassword(rs.getString(5));
             u.setTelephone(rs.getInt(6));
             u.setTypeProfil(rs.getString(7));
             u.setSexe(rs.getString(8));
             u.setPhoto(rs.getString(9));
             u.setNaissance(rs.getDate(10));
             u.setInterets(rs.getString(11));
             u.setToken(rs.getString(12));
             u.setCarteProf(rs.getString(13));
             u.setCompetance(rs.getString(14));
             u.setSpecialite(rs.getString(15));
        
         }
        }catch(SQLException ex)
        {
            System.out.println("Failed")  ;  
        }
        return u;
    }

     public List<User> getAll() {
       List<User> userList = new ArrayList();
        try{
         String query = "SELECT * FROM users";
         Statement statement = cnx.createStatement();
         ResultSet rs = statement.executeQuery(query);
         while(rs.next())
         {
             User u = new User();
             u.setId(rs.getInt(1));
             u.setNom(rs.getString(2));
             u.setPrenom(rs.getString(3));
             u.setEmail(rs.getString(4));
             u.setPassword(rs.getString(5));
             u.setTelephone(rs.getInt(6));
             u.setTypeProfil(rs.getString(7));
             u.setSexe(rs.getString(8));
             u.setPhoto(rs.getString(9));
             u.setNaissance(rs.getDate(10));
             u.setInterets(rs.getString(11));
             u.setToken(rs.getString(12));
             u.setCarteProf(rs.getString(13));
             u.setCompetance(rs.getString(14));
             u.setSpecialite(rs.getString(15));
        
             userList.add(u);
             
         }
        }catch(SQLException ex)
        {
            System.out.println("Failed")  ;  
        }
        return userList;
    }

    public boolean authentication(String email, String password)
    {
        User u = new User();
        String query = "SELECT * FROM users WHERE email = " +"'"+email+"'" + "AND password = "+"'"+password+"'";
        try{
            Statement ps = cnx.prepareStatement(query);
            
            ResultSet rs = ps.executeQuery(query);
            
            int count = 0;
            while(rs.next())
            {
                count++;
            }
            if(count == 1 )
            {
                return true;
            }
            else if(count > 1)
            {
                return false;
            }
            else
            {
                return false;
            }
            
         
        }catch(SQLException ex)
        {
            System.out.println("Failed")  ;  }
        return false;
                
    }
    }

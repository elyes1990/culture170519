/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CultureCite.serviceInterfaces;

import com.CultureCite.entities.Event;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Mejri Dorra
 */
public interface IEventService extends IGenericService<Event>{
    

    
    public List<Event> findByType(String type);
    //chercher selon date 
    public List<Event>findByDate (Date date);
    public List<Event>findAfterDate(Date date);
    public List<Event> findBeforeDate(Date date);
    
    public List<Event> findByLieu(String lieu);
    
    public List<Event> findByNombreTicketDispo(int nbrTicket);
    //chercher selon prix 
    public List<Event> findByPrix(double prix);
    public List<Event> findByMaxPrix(double prix);
    public List<Event> findByMinPrix(double prix);
    }

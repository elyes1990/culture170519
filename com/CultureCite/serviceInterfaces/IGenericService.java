/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CultureCite.serviceInterfaces;

import com.CultureCite.entities.Event;
import java.util.List;

/**
 *
 * @author Mejri Dorra
 */
public interface IGenericService<T> {
    
    public T  findById(int id);
    public List<T> findAll();
    public int create (T event);
    public int edit (T event);
    public int delete(T event);
    
}

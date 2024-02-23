/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itec1.e_commerce.services;

import java.util.List;

import com.itec1.e_commerce.dao.exceptions.NonexistentEntityException;

/**
 *
 * @author sjcex
 */
public interface ICRUD<T> {

    T create(T entity);

    T update(Long id, T entity) throws NonexistentEntityException, Exception;

    T findById(Long id);

    List<T> findAll();

    void disable(Long id) throws NonexistentEntityException, Exception;

    void delete(Long id) throws NonexistentEntityException;
    
}

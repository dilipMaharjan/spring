/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.dao;

import com.spring.entity.Category;
import java.util.List;

/**
 *
 * @author dmaharjan
 */
public interface CategoryDao {

    public List<Category> getAll();

    public Category findById(int id);
}

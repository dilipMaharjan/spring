/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.dao.impl;

import com.spring.dao.CategoryDao;
import com.spring.entity.Category;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dmaharjan
 */
@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Override
    public List<Category> getAll() {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Stories", true));
        categoryList.add(new Category(2, "Drama", false));
        categoryList.add(new Category(3, "Action", true));
        return categoryList;
    }

    @Override
    public Category findById(int id) {
        for (Category category : getAll()) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

}

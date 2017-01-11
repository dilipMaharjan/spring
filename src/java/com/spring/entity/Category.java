/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.entity;

/**
 *
 * @author dmaharjan
 */
public class Category {
private long id;
private String name;
private boolean status;

    public Category() {
    }

    public Category(long id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getStatus() {
        return status;
    }
    

}

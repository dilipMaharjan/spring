/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author dmaharjan
 */
@Controller
@RequestMapping(value = "/category")
public class CategoryController {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    String index() {
        return "Hello from annotaion";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody
    String test() {
        return "Hello from annotaion test";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public @ResponseBody
    String edit(@PathVariable("id") int id) {
        return "Edit id: " + id;
    }
}

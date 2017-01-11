/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.controller;

import com.spring.service.impl.CategoryServiceImpl;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @Autowired
    CategoryServiceImpl categoryServiceImpl;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("categories", categoryServiceImpl.getAll());
        return "category/index";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public @ResponseBody
    String test() {
        return "Hello from annotaion test";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") int id, Model model) {
        model.addAttribute("category", categoryServiceImpl.findById(id));
        return "category/edit";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    public @ResponseBody
    String editSave(@PathVariable("id") int id, HttpServletRequest request) {
        return "The post value is " + request.getParameter("name") + request.getParameter("status");
    }
}

package com.ust.BootSecurityInMemory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {

  /*  @GetMapping("/")
    public String greet() {
        return "working";
    }

    @GetMapping
    @RequestMapping("/admin")
    public String greetAdmin() {
        return "Admin@Work";
    }

    @GetMapping
    @RequestMapping("/user")
    public String greetUser(){
        return "User@Work";
    }*/

    @Autowired
    EmployeeService product;

    @GetMapping("/")
    public String adminWelcome(){
        return "welcome";
    }

    /*@PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String userDisplay(){
        return "this page is for user .";
    }*/

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return product.findAll();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/employees-by-description/{description}")
    public List<Employee> findByDescription(@PathVariable("description") String description){
        return product.findByDescription(description);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/employees-by-id/{id}")
    public Employee findById(@PathVariable("id") int id) {
        return product.findById(id);
    }
}

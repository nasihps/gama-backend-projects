package com.ust.BootSecurityInMemory;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements EmployeeServiceInterface {

    @Override
    public List<Employee> findAll() {
        return showProductList();
    }

    @Override
    public List<Employee> findByDescription(String description) {
        System.out.println("<<<" + description + ">>>");
        List<Employee> list = showProductList().stream().filter((product) -> (product.getDescription().equals(description)))
                .collect(Collectors.toList());
        System.out.println(list);
        return list;
    }
    @Override
    public Employee findById(int id) {

        //return showProductList().stream().filter(product -> product.getProductId() == id).findAny().get();
        return showProductList()
                .stream()
                .filter(product -> product.getPid() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("Product not found"));


    }
    private List<Employee> showProductList() {

        return Arrays.asList(

                new Employee(1, "iPhone 14", 74600),
                new Employee(2, "Split phone", 84600),
                new Employee(3, "Grand Pixels", 45600),
                new Employee(4, "iNSPIRON", 99900),
                new Employee(5, "Thinkpad", 64600),
                new Employee(6, "K6 Note", 35600),
                new Employee(7, "Bravo", 34600),
                new Employee(8, "HD Smart Tv", 94600),
                new Employee(9, "Ideapad", 45600)

        );

    }

}

package com.ust.BootSecurityInMemory;

public class Employee {

    private int pid;
    private String description;
    private double price;

    public Employee(){
    }

    public Employee(int pid, String description, double price) {
        this.pid = pid;
        this.description = description;
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "pid=" + pid +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}

package com.company;

public class VIPCustomer {

    private String name,email;
    private double limit;

    VIPCustomer(){
        this("Bryan Bergman", "bryan.dov.bergman@gmail.com", 10_000);
       // System.out.println("default constructor called");;
    }

    VIPCustomer(String name, String email){
        this(name, email, 10_000d);
        //System.out.println("2 parameter constructor called");
    }

    VIPCustomer(String name, String email, double limit){
        this.name = name;
        this.email = email;
        this.limit = limit;
        //System.out.println("initialize all fields manually constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}

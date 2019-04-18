package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        VIPCustomer a = new VIPCustomer();
        VIPCustomer b = new VIPCustomer("Adir Bergman", "Adir@gmail.com");
        VIPCustomer c = new VIPCustomer("Osher Bergman", "Osher@gmail.com", 200);

        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());


    }


}

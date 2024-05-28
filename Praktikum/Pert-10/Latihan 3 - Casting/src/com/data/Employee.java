package com.data;

public class Employee {
    
        String name;
    
        Employee(String name) {
            this.name = name;
        }
    
        void sayHello(String name) {
            System.out.println("Hello " + name);
        }    
}

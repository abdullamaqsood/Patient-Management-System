/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ds_lab_project;

import java.io.Serializable;

/**
 *
 * @author Abdullah Maqsood
 */
public class patient implements Serializable {
    
    String name;
    int mr;
    int age;
    String gender;
    double level;
    boolean admit;
    stack_visit r;

    public patient(String n, int m, int a, String g) {
        name = n;
        mr = m;
        age = a;
        gender = g;
        admit=false;
        r=new stack_visit();
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("MR Number: " + mr);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
    
}

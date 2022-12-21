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
public class hashing_seperate_chaining implements Serializable {
     linked_list_single[] table;
    int size;


    public hashing_seperate_chaining(int s) {
        size = s + (s / 3);
        table = new linked_list_single[size];
        for (int i = 0; i < size; i++) {
            table[i] = new linked_list_single();
        }
    }


    public int hash(int obj) {
        int position = obj % size;
        return position;
    }

    public void insert(patient obj) {
        int position = hash(obj.mr);
        table[position].insert(obj);
    }

    public patient find(int obj) {
        int position = hash(obj);
        return table[position].find(obj);
    }

    public void delete(int obj) {
        int position = hash(obj);
        table[position].delete(obj);
    }

    public void displayTable() {
        for (int i = 0; i < size; i++) {
            System.out.println(table[i].toString());
        }
    }
}

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
public class node implements Serializable {
     patient p;
    node next;

    public node(patient p) {
        this.p = p;
        next = null;
    }
}

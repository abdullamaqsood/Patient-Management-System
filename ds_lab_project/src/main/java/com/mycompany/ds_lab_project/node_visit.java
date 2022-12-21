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
public class node_visit implements Serializable {
     String docname;
    int room;
    int level;
    double pos;
    node_visit next;

    public node_visit(String d, int r, int l,double p) {
        docname = d;
        room=r;
        level = l;
        pos=p;
        next=null;
    }
}

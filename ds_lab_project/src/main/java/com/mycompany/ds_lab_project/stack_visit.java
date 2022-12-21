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
public class stack_visit implements Serializable {
     node_visit top;
     
     public stack_visit(){
         top=null;
     }

    public void push(node_visit c) {
       // node_visit enter = new node_visit(c);

        if (isEmpty()) {
            top = c;
        } else {
            node_visit temp;
            temp = top;
            c.next = temp;
            top = c;
        }
    }

    public boolean isEmpty() {
        return top == null;

    }
    
   public String pop(){
       String a="";
       a=a+"Doctor's Name:  "+top.docname+"  ";
       a=a+"Room #:  "+top.room+"  ";
       a=a+"Level: "+top.level;
       return a;
   }
}

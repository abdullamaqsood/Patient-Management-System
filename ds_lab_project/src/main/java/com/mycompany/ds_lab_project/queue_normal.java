/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ds_lab_project;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Abdullah Maqsood
 */
public class queue_normal implements Serializable {
    static ArrayList<String> list=new ArrayList<>();
    node front;
    node rear;

    public void enqueue(patient obj) {
        node enter = new node(obj);
        if (isEmpty()) {
            front = enter;
            rear = enter;
            list.add(obj.name);
        } else {
            rear.next = enter;
            rear = enter;
            list.add(obj.name);
        }
    }

    public patient dequeue() {
        node temp;
        if (isEmpty()) {
            System.out.println("The list is empty. Can't dequeue.");
            return null;
        } else if (front == rear) {
            temp = front;
            front = rear = null;
            return temp.p;
        } else {
            temp = front;
            front = front.next;
            return temp.p;
        }
    }

    public boolean isEmpty() {
        return front == null && rear == null;
    }
    
    public String toString(){
        node temp=front;
        String a="";
        while(temp!=null){
            a=a+temp.p.mr+" "+"\n";
            temp=temp.next;
        }
        return a;
    }
    
    public ArrayList<String> list(){
        return list;
    }
}

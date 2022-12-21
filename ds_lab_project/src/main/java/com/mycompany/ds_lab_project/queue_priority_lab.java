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
public class queue_priority_lab implements Serializable {
    node front;
    node rear;

    public queue_priority_lab() {
        front = null;
        rear = null;
    }

    public void enqueue(patient obj) {
        node enter = new node(obj);
        node temp = front;
        node prev = null;
        if (front == null) {
            front = enter;
            rear = enter;
        }
        else if(enter.p.r.top.pos==0){
            rear.next=enter;
            rear=enter;
        }
        else if (enter.p.r.top.pos>temp.p.r.top.pos) {
            enter.next = temp;
            front = enter;
        } else {
            while ( enter.p.r.top.pos<=temp.p.r.top.pos && temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            if (temp.p.r.top.pos < enter.p.r.top.pos) {
                enter.next = temp;
                prev.next = enter;
            } else {
                temp.next = enter;
                rear = enter;

            }
        }


    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else if (front.next == null) {
            front = rear = null;
        } else {
            front = front.next;
        }
    }

    public boolean isEmpty() {
        return front == null && rear == null;
    }

    public String toString() {
        node temp;
        temp = front;
        String a = "";
        if (isEmpty()) {
            return "The list is empty.";
        }
        while (temp != null) {
            a = a + temp.p.name +"     Room # "+temp.p.r.top.room+ " \n";
            temp = temp.next;
        }
        return a;
    }
    
    
}


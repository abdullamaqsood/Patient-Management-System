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
public class linked_list_single implements Serializable {
     node head;

    public linked_list_single() {
        head = null;
    }

    public void insert(patient value) {
        node enter = new node(value);
        node temp;
        if (head == null) {
            head = enter;
        } else {
            temp = head;
            head = enter;
            head.next = temp;
        }
    }

    public patient find(int value) {
        boolean found = false;
        node temp;
        if (head == null) {
            return null;
        } else {
            temp = head;
            while (temp.next != null && temp.p.mr != value) {
                temp = temp.next;
            }
            if (temp.p.mr == value) {
                return temp.p;
            }
        }
        return null;
    }

    public void clear() {
        head = null;
    }


    public void delete(int value) {
        node temp;
        temp = head;
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            if (temp.p.mr == value) {
                head = temp.next;
            } else {
                while (temp.next != null && temp.next.p.mr != value) {
                    temp = temp.next;
                }
                if (temp.next != null) {
                    temp.next = temp.next.next;
                } else {
                    System.out.println("Item doesn't exists in the list.");
                }
            }
        }
    }

    public String toString() {
        node temp = head;
        String a = "";
        if (head == null) {
            return "The list is empty";
        } else {
            while (temp != null) {
                a = a + temp.p.name + ",";
                temp = temp.next;
            }

        }
        return a.substring(0, a.length() - 1);
    }
}

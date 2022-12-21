/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ds_lab_project;

/**
 *
 * @author Abdullah Maqsood
 */
public class linked_list {
    node_list head;

    public linked_list() {
        head = null;
    }

    public void insert(vertex value) {
        node_list enter = new node_list(value);
        node_list temp;
        if (head == null) {
            head = enter;
        } else {
            temp = head;
            head = enter;
            head.next = temp;
        }
    }

    public boolean find(vertex value) {
        node_list temp;
        if (head == null) {
            return false;
        } else {
            temp = head;
            while (temp.next != null && !temp.v.equals(value)) {
                temp = temp.next;
            }
            if (temp.v.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        head = null;
    }


    public void delete(vertex value) {
        node_list temp;
        temp = head;
        if (head == null) {
            System.out.println("The list is empty.");
        } else {
            if (temp.v.equals(value)) {
                head = temp.next;
            } else {
                while (temp.next != null && !temp.next.v.equals(value)) {
                    temp = temp.next;
                }
                if (temp.next != null) {
                    temp.next = temp.next.next;
                } else {
                    System.out.println("Edge doesn't exists in the list.");
                }
            }
        }
    }

    public String toString() {
        node_list temp = head;
        String a = "";
        if (head == null) {
            return "The list is empty";
        } else {
            while (temp != null) {
                a = a + temp.v.name + ",";
                temp = temp.next;
            }

        }
        return a.substring(0, a.length() - 1);
    }
}


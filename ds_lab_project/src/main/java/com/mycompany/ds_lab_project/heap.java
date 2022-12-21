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
public class heap implements Serializable {
    patient[] arr;
    int curr_position = -1;

    public heap(int size) {
        arr =  new patient[size];
    }

    public patient getMax(){
        return arr[0];
    }

    public void sift_up(int index){
        int parent = (index - 1) / 2;
        if (index > 0) {
            if (arr[index].r.top.pos>arr[parent].r.top.pos) {
                swap(parent,index);
                sift_up(parent);
            }
        }
    }

    public void sift_down(int index) {
        int leftchild = (2 * index) + 1;
        int rightchild = (2 * index) + 2;
        patient largest=arr[index];
        if (leftchild <=curr_position && arr[leftchild].r.top.pos>arr[index].r.top.pos ) {
            largest=arr[leftchild];
        }
        if (rightchild <=curr_position && arr[rightchild].r.top.pos>largest.r.top.pos ) {
            largest=arr[rightchild];
        }
            if (largest.r.top.pos!=arr[index].r.top.pos) {
                if (largest.r.top.pos==(arr[leftchild].r.top.pos)) {
                    swap(leftchild,index);
                    sift_down(leftchild);
                } else if (largest.r.top.pos==(arr[rightchild].r.top.pos)) {
                    swap(rightchild,index);
                    sift_down(rightchild);
                }
        }
            }

    public void insert(patient d){
        if (curr_position < arr.length) {
            curr_position++;
            arr[curr_position] = d;
            sift_up(curr_position);
        }
        else {
            System.out.println("Array is full");
        }
    }

    public patient extractMax() {
        patient max=null;
        
        
        if (curr_position > 0) {
            max=arr[0];
            arr[0] = arr[curr_position];
            sift_down(0);
            curr_position--;
            return max;
        } 
        else if(curr_position==0){
           max=arr[0];
            arr[0]=null;
            curr_position--;
            return max;
        }
            else {
           return max;
        }

    }

    public int find(patient d) {
        for (int i = 0; i <= curr_position; i++) {
            if(arr[i].mr==d.mr){
                return i;
            }
        }
        return -1;
    }

    public void remove(patient value){
        int index = find(value);
        if(index!=-1){
        arr[index] = arr[curr_position];
        sift_down(index);
        curr_position--;
        }
        else{
            System.out.println("The value to be deleted not found.");
        }

    }


    public String print() {
        String a="";
        for (int x = 0; x <= curr_position; x++) {
           a=a+arr[x].name +"\n";
        }
        return a;
    }

    public void swap(int i,int j){
        patient temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ds_lab_project;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdullah Maqsood
 */

public class Ds_lab_project {
    static ArrayList<Integer> mr = new ArrayList<>();
    static hashing_seperate_chaining record = new hashing_seperate_chaining(80);
    static queue_normal normal = new queue_normal();
    static queue_priority_lab lab = new queue_priority_lab();
    static boolean[] room=new boolean[20];
    static heap room_pri=new heap(100);
    static hash_graph route = new hash_graph(6);

    public static void main(String[] args) {
        route.add_vertex("A");
        route.add_vertex("B");
        route.add_vertex("C");
        route.add_vertex("D");
        route.add_vertex("E");
        route.add_vertex("F");
        
        route.add_edge("A","D");
        route.add_edge("B","D");
        route.add_edge("B","E");
        route.add_edge("B","F");
        route.add_edge("C","E");
        route.add_edge("C","F");
        route.add_edge("D","E");                   
        route.add_edge("E","F");

        FileInputStream fis;
        ObjectInputStream ois;
        try { 
            fis = new FileInputStream("hash.ser");
             ois=new ObjectInputStream(fis);          
            try{
            while(true){
             patient p=(patient)ois.readObject();
             mr.add(p.mr);
             record.insert(p);
            }   
            }
        catch(EOFException e){
           ois.close();
            fis.close();
        }
     catch (ClassNotFoundException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        } 
         catch (IOException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
         try { 
            fis = new FileInputStream("heap.ser");
             ois=new ObjectInputStream(fis);          
            try{
            while(true){
             patient p=(patient)ois.readObject();
             if(p!=null){
            room_pri.insert(p);
             }
            }   
            }
        catch(EOFException e){
           ois.close();
            fis.close();
        }
     catch (ClassNotFoundException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        } 
         catch (IOException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
          try { 
            fis = new FileInputStream("lab.ser");
             ois=new ObjectInputStream(fis);          
            try{
            while(true){
             patient p=(patient)ois.readObject();
             if(p!=null){
             lab.enqueue(p);
             }
            }   
            }
        catch(EOFException e){
           ois.close();
            fis.close();
        }
     catch (ClassNotFoundException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        } 
         catch (IOException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
          
           try { 
            fis = new FileInputStream("normal.ser");
             ois=new ObjectInputStream(fis);          
            try{
            while(true){
             patient p=(patient)ois.readObject();
             if(p!=null){
            normal.enqueue(p);
            }
            }   
            }
        catch(EOFException e){
           ois.close();
            fis.close();
        }
     catch (ClassNotFoundException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        } 
         catch (IOException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           try {
            FileInputStream fstream = new FileInputStream("room.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            for (int i = 0; i < room.length; i++) {
                String strLine = br.readLine();
                if(strLine.equals("false")){
                    room[i]=false;
                }
                else{
                    room[i]=true;
                }
            }
            

            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
           
           try {
            FileInputStream fstream = new FileInputStream("number.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            
                String strLine = br.readLine();
                double a=Double.parseDouble(strLine);
                add_record.level2=a;
                
                String strLine2 = br.readLine();
                double b=Double.parseDouble(strLine2);
                add_record.level3=b;
                
                String strLine3 = br.readLine();
                double c=Double.parseDouble(strLine3);
                add_record.level4=c;
           
            

            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        
        
        record.displayTable();

        welcome w=new welcome();
        w.show();
        
    }
    
    
    
    
    
    
}

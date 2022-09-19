/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet5prakpbo1;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas1BufferedReader {
    public static void main(String[] args){
        BufferedReader dataIn =new BufferedReader (new InputStreamReader (System.in));
        
        String a, b, c;
        System.out.println("Program Menampilkan Tulisan");
        
        try {
            System.out.println("Enter word1:");
            a =dataIn.readLine();

            
            System.out.println("Enter word2:");
            b =dataIn.readLine();
            
             System.out.println("Enter word3:");
            c =dataIn.readLine();
           
             System.out.println(a+b+c);
         
        }
        
       catch (IOException e) {
            System.out.print("gagal membaca keyboard");
            
        }
    }
}

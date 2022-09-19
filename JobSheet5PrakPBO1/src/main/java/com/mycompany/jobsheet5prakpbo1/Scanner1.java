/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet5prakpbo1;

import java.util.Scanner;
/**
 * Cretaed by 21343062-Nesa Athallah
 * @author user
 */

public class Scanner1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan nama lengkap: ");
        String nama = in.nextLine();
        
        System.out.println("Masukan NIM: ");
        int NIM = in.nextInt();
        
        System.out.println("Masukkan Nilai: ");
        float nilai = in.nextFloat();
        
        System.out.println("/n Nama : " + nama +
                          "/n NIM : " + NIM +
                          "/n Nilai : " + nilai);
    }
}
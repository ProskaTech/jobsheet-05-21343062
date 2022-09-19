/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet5prakpbo1;

/**
 * Created by 21343062-Nesa Atahllah
 * @author user
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader1 {
    public static void main(String[] args){
        BufferedReader dataIn =new BufferedReader (new InputStreamReader (System.in));
        
        String a, b;
        float angka1, angka2, jumlah;
        System.out.println("Program Pejumlahan Dua Buah Bilangan");
        
        try {
            System.out.println("Masukkan Angka Pertama :");
            a =dataIn.readLine();
            /*Data yang akan diproses aritmatika harus dikonversikan dulu
            dari tipe data String ke tipe data angka yang diperlukan.
            Data yang diperoleh dari inputan kelas BufferedReade tipe datanya selalu String*/
            angka1 = Float.parseFloat(a);
            
            System.out.println("Masukkan Angka Kedua :");
            b =dataIn.readLine();
            angka2 = Float.parseFloat(b);
            
            jumlah = angka2 + angka1;
            System.out.println("Jumlah : "+jumlah);
            
        }
        
       catch (IOException e) {
            System.out.println("gagal membaca keyboard");
            
        }
    }
}
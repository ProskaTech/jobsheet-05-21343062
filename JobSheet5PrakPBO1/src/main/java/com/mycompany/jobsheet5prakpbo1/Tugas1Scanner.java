/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet5prakpbo1;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
import java.util.Scanner;
public class Tugas1Scanner {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter word1: ");
        String word1 = in.nextLine();
        
        System.out.println("Enter word2: ");
        String word2 = in.nextLine();
        
        System.out.println("Enter word3: ");
        String word3 = in.nextLine();
        
        System.out.println(word1 + word2 + word3);
    }
}
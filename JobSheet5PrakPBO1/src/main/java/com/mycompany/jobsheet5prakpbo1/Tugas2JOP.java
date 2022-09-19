/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet5prakpbo1;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
import javax.swing.JOptionPane;
public class Tugas2JOP {
    public static void main (String[] args ){
        String word1="", word2="",word3="";
        
        word1 = JOptionPane.showInputDialog("Enter word1: ");
        word2 = JOptionPane.showInputDialog("Enter word2: ");
        word3 = JOptionPane.showInputDialog("Enter word3: ");
        
        String msg = word1 + word2 + word3;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.print(word1 + word2 + word3);
               
    }
}
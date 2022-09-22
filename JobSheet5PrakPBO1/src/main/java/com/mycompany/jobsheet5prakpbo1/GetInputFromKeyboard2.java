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

public class GetInputFromKeyboard2 {
    public static void main (String[] args ){
        String name ="", hoby ="" ;
        
        name = JOptionPane.showInputDialog("Nama Anda: ");
        hoby = JOptionPane.showInputDialog("Hobi Anda: ");
        
        String msg = "Jadi Hobi Anda" + hoby+ "."+ "Hobi yang bagus " +name;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.print("Jadi Hobi Anda " +hoby+". Hobi yang bagus "+name);
               
    }
}
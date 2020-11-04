/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan33.oo.userlogin;

import java.util.Scanner;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program User Login
 */
import data.User;

public class PBOIF210119051Latihan33OOUserLogin {
     private static String usName;
     private static String passWord;
    
    public static void main(String[] args) {
     
     Scanner input = new Scanner(System.in);
     
        
        System.out.print("Masukan Username = ");
        usName = input.next();
        
        System.out.print("Masukan Password = ");
        passWord = input.next();
        
        User usLog = new User();
        
        usLog.pengecekanLogin(usName, passWord);
        
        
        
    }
    
}

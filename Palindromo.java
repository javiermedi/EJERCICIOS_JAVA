/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.palindromo;

import java.util.Scanner;
/**
 * @author javie
 */
public class Palindromo {
    
    public static void main(String[] args) {
        Scanner r = new Scanner (System.in);
        String p;
        System.out.print("Introduce una palabra \n");
        p = r.nextLine();
        System.out.println(Palindro(p));    
    }
    
    public static boolean Palindro(String frase) {
        String str = frase.toLowerCase();
        String reverse = new StringBuilder(str).reverse().toString();
        return reverse.equals(str);
    }
}

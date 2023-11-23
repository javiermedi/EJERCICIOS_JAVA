/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.palindromo;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        int n;
        System.out.print("Introduce un número\n");
        n=e.nextInt();
        System.out.println("El factorial de " + n + "! = " + ObtenerFactorial(n));
    }
    
     public static int ObtenerFactorial (int n){
        if (n==0) return 1;
        else return  ObtenerFactorial(Math.abs(n)-1)*Math.abs(n);
    }
}

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
public class CalculoTarifa {
    
      public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        double horas; 
        System.out.println("Ingresa las horas a cobrar\n");
        horas=e.nextInt();
        System.out.println("Monto total: $" + Tarifa(horas));
    }
      
    public static double Tarifa(double horas) {
        double Total = 0;
        double m = horas * 60;

        double[][] fares = {
                {0, 15, 60, 1, 1},
                {1, 7, 30, 5, 2},
                {2, 4, 15, 1, 3},
                {3, 2, 60, 1, 3}
        };

        for (int i = 0; i < fares.length; i++) {
            if (m <= fares[i][2]) {
                Total += m * fares[i][1];
                break;
            } else {
                Total += fares[i][2] * fares[i][1];
                m -= fares[i][2];
                if (fares[i][3] > 1) {
                    int repeticiones = (int) Math.floor(m / fares[i][2]);
                    Total += repeticiones * fares[i][1] * fares[i][3];
                    m -= repeticiones * fares[i][2];
                }
            }
        }
        return Total;
    }
}

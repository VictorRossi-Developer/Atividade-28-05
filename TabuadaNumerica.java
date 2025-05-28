/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadanumerica;

/**
 *
 * @author Victor Rossi
 */
import java.util.Scanner;

public class TabuadaNumerica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Descubra a tabuada de um numero");
        
        System.out.println("Digite um numero");
        double numero = scanner.nextDouble();
        
         System.out.println("Tabuada de" + numero + ":");
                 
        for (double i = 1; i <=10; i++) {
            double resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
                 }
        scanner.close();
              }
        }
            
        
        
        
       
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediadasnotas;

/**
 *
 * @author Victor Rossi
 */

import java.util.Scanner;

public class MediaDasNotas {

    public static void main(String[] args) {
try  (Scanner scanner = new Scanner(System.in)) {
while (true) {

 System.out.println("Voce precisara digitar 4 notas"); //Evitei usar caracteres especiais para que não exiba um caractere de não identificado!

 
 System.out.println("Primeira Nota");
 double nota1 = scanner.nextInt();
 
 System.out.println("Segunda Nota");
 double nota2 = scanner.nextDouble();
 
 System.out.println("Terceira Nota");
 double nota3 = scanner.nextDouble();
 
 System.out.println("Quarta Nota");
 double nota4 = scanner.nextDouble();
 
 
 double media = (nota1+nota2+nota3+nota4)/4;

//Resultado da MÉDIA das notas:
System.out.println("A media sera:" + media);

// Pergunta se quer refazer a média:

                System.out.println("Deseja refazer a media? s/n");
                String resposta = scanner.next();
                
                if (!resposta.equalsIgnoreCase("s")) { //Qualquer resposta que seja diferente de "s" irá encerrar a calculadora
                    System.out.println("Encerrando....");
                    break;

                }
             }

          }

    }
    
}
                  
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dadosdeusuario;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class DadosDeUsuario {

    public static void main(String[] args) { //Altura deve ser com vírgula não com ponto, exemplo: 1,74
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua data de nascimento (dd/mm/aaaa):");
        String dataNascimento = scanner.nextLine();

        System.out.println("Digite seu curso:");
        String curso = scanner.nextLine();

        System.out.println("Digite sua série:");
        String serie = scanner.nextLine();

        System.out.println("Digite sua altura (em metros):");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso (em kg):");
        double peso = scanner.nextDouble();

        System.out.println("\n--- Dados cadastrados ---");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Curso: " + curso);
        System.out.println("Série: " + serie);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");

        scanner.close();
    }
}

    
  
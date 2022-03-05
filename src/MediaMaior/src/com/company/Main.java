package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        float numero;
        float maior = 0;
        float soma =0;

        float count = 0;
        do {
             System.out.printf("Número: ");
            numero = scan.nextFloat();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while (count < 2);

            System.out.println("Maior: " + maior);
        System.out.println("Média:" + soma / 2);
    }
}

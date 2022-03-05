package com.company;


import java.util.Scanner;
import java.io.IOException;



public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double media = ((3.5 * a) + (7.5 * b)) / 11;


        System.out.printf("MEDIA = %.5f " , media);
        System.out.println();


        }

    }





package org.example;

import java.util.Scanner;

public class ProgramaVerificarIdade {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano você nasceu?");
        int nasc = t.nextInt();
        int i = 2024-nasc;

        if (i>=18){
            System.out.println("Você tem " + i + " anos, já é maior de idade!");
        } else{
            System.out.println("Você tem " + i + " anos, ainda é menor de idade!");

        }


    }
}
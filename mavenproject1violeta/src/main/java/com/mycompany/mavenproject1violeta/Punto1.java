/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1violeta;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Punto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = scanner.nextInt();
        int suma=0;
        for (int i = 0; i < num; i++){
            if (i%3==0 && i%5==0){
                continue;
            }
            else if (i%3==0 || i%5==0){
                suma= suma + i;
            }
            System.out.println("La suma es" + suma);
        }
    }
    }

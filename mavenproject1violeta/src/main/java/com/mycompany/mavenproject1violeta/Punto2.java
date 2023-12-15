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
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu contraseña para validarla");
        String contra = scanner.nextLine();
        
        if (contra.length()<8){
            System.out.println("Su contraseña tiene " + contra.length() + "caracteres");
            System.out.println("Su contraseña debe ser mas larga, mínimo 8 caracteres");
        }
        scanner.close();
    }
    
}
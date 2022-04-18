/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.edu.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author NITRO5
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        int fac = 1;
        int num;
        try (Scanner valor = new Scanner(System.in)) {
			System.out.println("Ingresar Numero: ");
			num = valor.nextInt();
		}
        for (int i = num; i > 0; i--) {
            fac = fac*i;
        }
        System.out.println("Resultado: " + fac + " de " + num+"!");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.edu.mavenproject1;

import java.text.DecimalFormat;

/**
 *
 * @author NITRO5
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        /*
    	 double = i;
         potencia = num;
         */
        double num[] = {2, 7, 5, 4, 9, 3, 6, 8, 1, 10};
        double cubo, sumcubo = 0, limite = num.length;

        for (int i1 = 0; i1 < limite; i1++) {
            cubo = Math.pow(num[i1], 3);
            sumcubo = sumcubo + cubo;
            DecimalFormat df = new DecimalFormat("#");
            System.out.println("Cubo de  " + df.format(num[i1]) +
                                    " : " + df.format(cubo));
        }
        DecimalFormat df = new DecimalFormat("#");
        System.out.println("Suma de Cubos : " + df.format(sumcubo));
    }
}

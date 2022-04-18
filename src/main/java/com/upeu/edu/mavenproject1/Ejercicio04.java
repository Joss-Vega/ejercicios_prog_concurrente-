/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.edu.mavenproject1;

import com.upeu.edu.mavenproject1.model.Leopardo01;
import com.upeu.edu.mavenproject1.model.Leopardo02;
import com.upeu.edu.mavenproject1.model.Leopardo03;
import com.upeu.edu.mavenproject1.model.Leopardo04;

/**
 *
 * @author NITRO5
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        Leopardo01 l1 = new Leopardo01("Leopardo 01");
        Leopardo02 l2 = new Leopardo02("Leopardo 02");
        Leopardo03 l3 = new Leopardo03("Leopardo 03");
        Leopardo04 l4 = new Leopardo04("Leopardo 04");

        l1.start();
        l2.start();
        l3.start();
        l4.start();
    }

}

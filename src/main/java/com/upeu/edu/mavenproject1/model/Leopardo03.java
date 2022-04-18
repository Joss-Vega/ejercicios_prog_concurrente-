/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.edu.mavenproject1.model;

/**
 *
 * @author NITRO5
 */
public class Leopardo03 extends Thread{
    public Leopardo03(String nombre){
        super(nombre);
    }
    
    @Override
	public void run () {
	for(int i=1; i<=3; i++) {
	try {
            Thread.sleep(1200);
	} catch (Exception e) {
	e.printStackTrace();
	}
    System.out.println(Thread.currentThread().getName() + " corriendo "+i+"");
	if (i%10==0) {
	try {
	Thread.sleep(1000);
	} catch (Exception e) {
	e.printStackTrace();
	}
    }
}
		
	}
}

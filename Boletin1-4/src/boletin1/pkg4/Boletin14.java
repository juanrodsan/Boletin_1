/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1.pkg4;

import java.util.Scanner;

/**
 *
 * @author jrodriguezsanjorge
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    float num1=0,num2=0,S=0,R=0,P=0,C=0;
    System.out.println("teclea num1");
    num1=ler.nextFloat();
    System.out.println("teclea num2");
    num2=ler.nextFloat();
    S=num1+num2;
    R=num1-num2;
    P=num1*num2;
    C=num1/num2;
    System.out.println("Suma = "+S+"\nResta = "+R+"\nProducto = "+P+"\nCociente = "+C);
    }
    
}

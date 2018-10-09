/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1.pkg5;

import java.util.Scanner;

/**
 *
 * @author jrodriguezsanjorge
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    float millas=0, metros=0, paso=1852;
    System.out.println("teclea las millas");
    millas=ler.nextFloat();
    metros= millas*paso;
    System.out.println("metros = "+metros);
    }
    
}

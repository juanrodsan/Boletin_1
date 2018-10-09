/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1.pkg3;

import java.util.Scanner;

/**
 *
 * @author jrodriguezsanjorge
 */
public class Boletin13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner ler = new Scanner (System.in);
    float euros= 0,dolares=0,cambio=0;
    System.out.println("teclea euros");
    euros=ler.nextFloat();
    System.out.println("teclea cambio");
    cambio=ler.nextFloat();
    dolares= euros*cambio;
    System.out.println("dolares = "+dolares);
    }
    
}

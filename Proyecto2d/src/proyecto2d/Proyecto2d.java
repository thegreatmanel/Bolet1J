/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2d;

import java.util.Scanner;

/**
 *
 * @author propa
 */
public class Proyecto2d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float millas,metros;
        System.out.println("Insira millas:");
        Scanner dato=new Scanner(System.in);
        millas =dato.nextFloat();
        metros=1852*millas;
        System.out.println("metros:"+metros);
    }
    
}

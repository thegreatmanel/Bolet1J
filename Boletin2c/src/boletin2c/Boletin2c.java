/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2c;

import java.util.Scanner;

/**
 *
 * @author propa
 */
public class Boletin2c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float dolares;
        float euros;
        
        System.out.println("Insira euros:");
        Scanner dato=new Scanner(System.in);
        euros=dato.nextFloat();
        dolares=euros*1.76f;
        System.out.println("Dolares:"+dolares);
    }
    
}

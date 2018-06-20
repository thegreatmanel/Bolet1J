/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2e;

import java.util.Scanner;

/**
 *
 * @author propa
 */
public class Proyecto2e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float prezo,desconto,descontoprim;
        System.out.println("Insira prezo:");
        Scanner dato=new Scanner(System.in);
        prezo=dato.nextFloat();
        System.out.println("Insira desconto");
        Scanner dato2=new Scanner(System.in);
        descontoprim=dato2.nextFloat();
        desconto=descontoprim/100;
        System.out.println("Prezo final: "+prezo*desconto);
    }
    
}

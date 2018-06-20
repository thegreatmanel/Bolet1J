/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2g;

import java.util.Scanner;

/**
 *
 * @author propa
 */
public class Boletin2g {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float soldob,soldol,kms,diet,irpf,ss,vents;
      
       
        System.out.println("Insira saldo total");
        Scanner dato=new Scanner(System.in);
        float soldo=dato.nextFloat();
         irpf=0.18f*soldo;
         ss=36;
        System.out.println("Insira distancia diaria");
        Scanner dato2=new Scanner(System.in);
        float kmsd=dato2.nextFloat();
        System.out.println("Insira dias traballados");
        Scanner dato3=new Scanner(System.in);
        float dias=dato3.nextFloat();
        System.out.println("Insira importe total de ventas");
        Scanner dato4=new Scanner(System.in);
        float ventst= dato4.nextFloat();
        vents=ventst*0.05f;
        kms=kmsd*dias*2;
        diet=30*dias;
        soldob=soldo+kms+diet+vents;
        soldol=soldob-irpf-ss;
        System.out.println("soldo bruto: "+soldob);
        System.out.println("soldo limpo: "+soldol);
        
    }
    
}

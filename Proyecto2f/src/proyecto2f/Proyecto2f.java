/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2f;

import java.util.Scanner;

/**
 *
 * @author propa
 */
public class Proyecto2f {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float cen,vinte,cinco,un,numb1,numb2,numb3,total;
        System.out.println("billetes de cen: ");
        Scanner dato1=new Scanner(System.in);
        numb1=dato1.nextFloat();
        cen=numb1*100;
        System.out.println("billetes de vinte: ");
         Scanner dato2=new Scanner(System.in);
         numb2=dato2.nextFloat();
         vinte=numb2*20;
        System.out.println("billetes de cinco: ");
         Scanner dato3=new Scanner(System.in);
         numb3=dato3.nextFloat();
         cinco=numb3*5;
        System.out.println("moedas de un: ");
         Scanner dato4=new Scanner(System.in);
         un=dato4.nextFloat();
         total=cen+vinte+cinco+un;
         System.out.println("total:"+total);
         
         
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2a;

/**
 *
 * @author propa
 */
import java.util.Scanner;
public class Proyecto2a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float area,base,altura;
        System.out.println("base:");
        Scanner dato=new Scanner(System.in);
        base=dato.nextFloat();
        System.out.println("altura:");
        altura=dato.nextFloat();
        area=base*altura/2;
            
         System.out.println("su area es de:"+area);
    }
    
}

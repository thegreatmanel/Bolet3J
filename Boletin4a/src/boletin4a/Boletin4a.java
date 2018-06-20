/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4a;

/**
 *
 * @author propa
 */
import java.util.Scanner;
public class Boletin4a {
    


  
    public static void main(String[] args) {
        System.out.println("Insira Velocidade actual");
        Scanner dato=new Scanner(System.in);
        int velocidade=dato.nextInt();
        coche obj1 = new coche();
        obj1.getVelocidade(velocidade);
        
        
        obj1.acelerar(velocidade);
        obj1.decelerar(velocidade);
        
        
     
    
     
    }
    
}

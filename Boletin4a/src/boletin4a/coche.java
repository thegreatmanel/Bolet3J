/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4a;

import java.util.Scanner;

/**
 *
 * @author propa
 */
public class coche {
 private int velocidade;
 private int frenado;
 private int aceleracion;


 public coche(){
 velocidade=0;}
    
    public void acelerar(int i){
        System.out.println("Insira aceleracion");
        Scanner dato2=new Scanner(System.in);
        int acel=dato2.nextInt();
        int vacel= i+acel;
        System.out.println("velocidad actual acelerado: "+ vacel);
        
    }
    public void decelerar(int i){
        System.out.println("Insira deceleracion");
    Scanner dato3=new Scanner(System.in);
    int decel=dato3.nextInt();
    int vdecel=i-decel;
        System.out.println("velocidade actual frenado: "+vdecel);}
    public int getVelocidade(int i) {
        
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
 
    
}

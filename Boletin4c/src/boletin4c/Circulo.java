/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4c;

import java.util.Scanner;

/**
 *
 * @author propa
 */
public class Circulo {
    private double radio;
    private double pi=3.14;

    public Circulo() {
       
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
    public void calcularArea(){
        System.out.println("Insira radio");
        Scanner dato=new Scanner(System.in);
        radio=dato.nextDouble();
        
       double rcuad= Math.pow(radio, 2);
       double area=rcuad*pi;
        System.out.println("a area e de: "+ area);
        
    }
    public void calcularLonxitude(){
        System.out.println("Insira radio, outra vez, si");
    Scanner dato2=new Scanner(System.in);
    radio=dato2.nextDouble();
   
    double longi=2*radio*pi;
        System.out.println("A lonxitude e de "+ longi);}
    
    
}

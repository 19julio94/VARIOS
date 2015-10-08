package boletin25;

import java.util.Scanner;

public class Boletin25 {
static final int VALOR=1852; //esto es una constante.
    public static void main(String[] args) {
        float millas;
        
        Scanner obx= new Scanner (System.in);
        
        System.out.println("Introduceme las millas:");
        millas=obx.nextFloat();
        
        System.out.println("El calmbio de millas a metros es igual a: "+ VALOR*millas);
        
    }
    
}
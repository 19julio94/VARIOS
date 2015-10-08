package boletin22;

import java.util.Scanner;


public class Boletin22 {

    public static void main(String[] args) {
        
        float lado;
        
        Scanner obx= new Scanner(System.in);
        
        System.out.println("teclea el lado = ");
        lado =obx.nextFloat();
        
        System.out.println("el area del cuadrado es: "+ (lado*lado));
        
        
    }
    
}
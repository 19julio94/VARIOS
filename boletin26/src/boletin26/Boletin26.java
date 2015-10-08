package boletin26;

import java.util.Scanner;


public class Boletin26 {

    
    public static void main(String[] args) {
      
        float num1,num2;
        
        Scanner obx= new Scanner(System.in);
        
        System.out.println("Introduce el precio de la tarifa: ");
        num1= obx.nextFloat();
        System.out.println("Introduce el precio pagado: ");
        num2=obx.nextFloat();
        
        float resultado=(num1-num2)*100/num1;
        
        System.out.println("El porcentaje de del descuento es igual a :"+resultado);
    
}
}
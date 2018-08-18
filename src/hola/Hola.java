/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola;
import java.io.*;
import java.util.*;
/**
 *
 * @author CASA
 */
public class Hola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre=" ";
        double sueldo=0.00F;
        int edad=0,a=0,res=0;
        Scanner in =new Scanner(System.in);
   do{
    
       try{
        System.out.println("Ingrese los proximos datos ");
        System.out.println("Nombre: ");
        if(a!=0){
            in.nextLine();
        }
        nombre=in.nextLine();
        System.out.println(" Sueldo: ");
        sueldo=in.nextDouble();
        System.out.println(" Edad: ");
        edad=in.nextInt();  
        
       }catch(InputMismatchException ex){
           System.out.println("Ingreso mal los datos "
                            + "vuelva a introducirlo ");
           res=3;a=1;
       }
      if(res!=3){
       System.out.println(" Su nombre es "+nombre+
                           " Su sueldo es "+sueldo+
                           " Su edad es  "+edad);
       do{
        try{
            if(a==0){
                in.nextLine();
            }
            System.out.println("Desea continuar ? si=1 no=0");
            nombre=in.nextLine();
            a=Integer.parseInt(nombre);res=1;
        }catch(NumberFormatException ex){
         res=3; a=0;
          System.out.println("Ingreso mal los datos "
                             + "vuelva a ingresarlos "+
                             "\n precion enter para continuar");
        } 
       }while(res==3);
      }
   }while(a==1);
    }
    
}

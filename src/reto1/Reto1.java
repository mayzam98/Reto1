/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import clases.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author mayko
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ClsPerson persona = new ClsPerson("maykol", "3217182623", "la mierda", "Men");
        //persona.goHome();
        
        
        Scanner in = new Scanner(System.in);
        
        int reto = 100;
        while (reto != 0 ){
            System.out.println("\n===================--MENU--=====================");
            System.out.println("----------------------------------------------------");
            System.out.println("Ingrese el numero correspondiente al reto a iniciar: ");
            System.out.println("    1-Bajo el radar\n    2-Ahoy capitan\n    3-Picas y fijas\n    4-espacios de color\n    5-Menor distancia\n     -cualquier numero para salir");
            System.out.println("___________________________________________________\n -->>");

            reto = in.nextInt();

            switch (reto){
                case 1:
                    System.out.println("Ingrese la distancia uno en metros: ");
                    float distanciaUno = in.nextFloat();
                    System.out.println("Ingrese la distancia dos en metros: ");
                    float distanciaDos = in.nextFloat();
                    System.out.println("Ingrese el lapso de tiempo en minutos");
                    float tiempo = in.nextFloat();
                    ClsBajoRadar multaRadar = new ClsBajoRadar();
                    System.out.println(multaRadar.multarVelocidad(distanciaUno, distanciaDos, tiempo));                    
                    break;
                case 2:
                        ClsAhoycapitan ahoyCapitan = new ClsAhoycapitan();
                        ahoyCapitan.ahoy(); 
                    break;
                case 3:
                    ClsPicasFijas juego = new ClsPicasFijas();
                    juego.iniciar_juego();
                    
                    break;
                case 4:
                    ClsEspaciosDeColor espaciosDeColor = new ClsEspaciosDeColor();
                    espaciosDeColor.convertir();
                    
                    break;
                case 5:                    
                    //lectura coordenadas celular 1
                    System.out.println("Ingrese la cordenada en X del celular 1: ");
                    float xc1 = in.nextFloat();
                    System.out.println("Ingrese la cordenada en Y del celular 1: ");
                    float yc1 = in.nextFloat();
                    
                    //lectura coordenadas antena 1
                    System.out.println("Ingrese la cordenada en X de la antena 1: ");
                    float xa1 = in.nextFloat();
                    System.out.println("Ingrese la cordenada en Y de la antena 1: ");
                    float ya1 = in.nextFloat();

                    //lectura coordenadas central holi 
                    System.out.println("Ingrese la cordenada en X de la central holi: "); 
                    float xch = in.nextFloat();
                    System.out.println("Ingrese la cordenada en Y de la central holi: ");
                    float ych = in.nextFloat();

                    //lectura coordenadas antena 2
                    System.out.println("Ingrese la cordenada en X de la antena 2: ");
                    float xa2 = in.nextFloat();
                    System.out.println("Ingrese la cordenada en Y de la antena 2: ");
                    float ya2 = in.nextFloat();

                    //lectura coordenadas celular 2
                    System.out.println("Ingrese la cordenada en X del celular 2: ");
                    float xc2 = in.nextFloat();
                    System.out.println("Ingrese la cordenada en Y del celular 2: ");
                    float yc2 = in.nextFloat();
                    
                    
                    float d1=calcularDistancia(xc1,yc1,xa1,ya1);
                    float d2=calcularDistancia(xa1,ya1,xch,ych);
                    float d3=calcularDistancia(xch,ych,xa2,ya2);
                    float d4=calcularDistancia(xa2,ya2,xc2,yc2);
                    float distanciaTotal = d1+d2+d3+d4;
                    
                    System.out.println("La distancia total es: "+distanciaTotal);
                    break;

                default:
                    reto = 0;
                    break;
            }  
        }  
    }
    
    public static float calcularDistancia(float x1, float y1, float x2, float y2){
        return (float) Math.sqrt(Math.pow((double)(x2-x1), 2) + Math.pow((double)(y2-y1),2));
    }
    
}

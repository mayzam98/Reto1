/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mayko
 */
public class ClsPicasFijas {
    
    
    private List generateNumber(){
        List codigo = new ArrayList<>();
        for(int i=0; i<4;i++){
            boolean repetir = true;
            while (repetir){
                Random random = new Random();
                int aleatorio = random.nextInt(10);
                if(!codigo.contains(aleatorio)){
                    codigo.add(aleatorio);
                    repetir = false;
                }
            }
        
        }
            
        
        return codigo;
    }
    
    
    private List picasFijas(List codigo, String propuesta){
        System.out.println("el codigo que llega es: "+codigo);
        System.out.println("la propuesta que llega es un str: "+propuesta);
        List retorno = new ArrayList<>();
        int aciertos = 0;
        int coincidencias = 0;
        
        for(int i=0; i<4; i++){
            if (codigo.indexOf(Integer.parseInt(""+propuesta.charAt(i))) != -1){
                coincidencias = coincidencias+1;
                if(codigo.indexOf(Integer.parseInt(""+propuesta.charAt(i))) == i){
                    coincidencias = coincidencias-1;
                    aciertos = aciertos +1;
                }
            }
        }
        retorno.add(aciertos);
        retorno.add(coincidencias);
        return retorno;
        }
    
    
    public void iniciar_juego(){
        List resultado = new ArrayList<>();
        List codigo = new ArrayList<>();
        ClsPicasFijas juego = new ClsPicasFijas();
        codigo = juego.generateNumber();
        System.out.println(codigo);
        System.out.println("Bienvenidos al juego");
        System.out.println("Tienes que adivinar un número de 4 cifras distintas.");
        int intentos = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Que codigo propones: ");
        String propuesta = in.nextLine();
        int aciertos = 0;
        int coincidencias = 0;
        boolean ciclo = true;
        while(ciclo){
            if (propuesta.length() !=4 ){
                System.out.println("El numero debe contener 4 digitos");
                System.out.println("Que codigo propones: ");
                propuesta = in.nextLine();
                continue;
            }
            intentos = intentos+1;
            resultado = juego.picasFijas(codigo, propuesta);
            aciertos = (int) resultado.get(0);
            coincidencias = (int) resultado.get(1);
            
            System.out.println("Tu propuesta "+propuesta+" tiene "+aciertos+" fijas y "+coincidencias+" picas.");
            if(aciertos == 4){
                ciclo = false;
                break;
            }
            
            System.out.println("Que codigo propones: ");
            propuesta = in.nextLine();
        }
        System.out.println("Ganaste, tu numero de intentos fue: "+intentos);
        }
}




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.math.MathContext;
import java.time.temporal.WeekFields;
import java.lang.Math;
import java.util.Random;

/**
 *
 * @author mayko
 */
public class ClsCriatura {

    /**
     * @return the criatura
     */
    public String getCriatura() {
        return criatura;
    }

    
    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    public ClsCriatura() {
    }
    
    //Random ran = new Random();
        
    //int randomCriatura = 1+ ran.nextInt(7);
    //int randomDireccion =1+ ran.nextInt(3);
    
    
    private final int randomCriatura = (int) Math.floor(Math.random()*7);
    private final int randomDireccion = (int) Math.floor(Math.random()*3);
    
    private final String[] tipoCriaturas = {"Kraken","Sirenas","Ballena","Hipocampo","Macaraprono","Pulpo","Leviatanes","Hidras"}; 
    
    private final String[] direcciones = {"babor","estribor","proa","popa"};
    
    private final String criatura = tipoCriaturas[randomCriatura];
    private final String direccion = direcciones[randomDireccion];
    

    
}
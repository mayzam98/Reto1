/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author mayko
 */
public class ClsAhoycapitan {
    
    public void ahoy(){
        int cantidadCriaturas = 10;
        int contador = 0;
        while (contador <cantidadCriaturas){
            ClsCriatura animal = new ClsCriatura();
            String criatura = animal.getCriatura();
            String direccion = animal.getDireccion();
            
    if ("Kraken".equals(criatura) || "Hipocampo".equals(criatura) || "Pulpo".equals(criatura)){
        if("babor".equals(direccion) || "estribor".equals(direccion))
            System.out.println("Ahoy! capitán, un "+criatura+" a "+direccion);
        else
            System.out.println("Ahoy! capitán, un "+criatura+" por la "+direccion);
                    }
    else if (criatura.equals("Sirenas") || "Hidras".equals(criatura)){
        if ("babor".equals(direccion) || "estribor".equals(direccion))
            System.out.println("Ahoy! capitán, unas "+criatura+" a "+direccion);
        else
            System.out.println("Ahoy! capitán, unas "+criatura+" por la "+direccion);
              }
    else if( "Ballena".equals(criatura) || "Macaraprono".equals(criatura)){
        if ("babor".equals(direccion) || "estribor".equals(direccion))
            System.out.println("Ahoy! capitán, una "+criatura+" a "+direccion);
        else
            System.out.println("Ahoy! capitán, una "+criatura+ " por la "+direccion);
              } 
            contador++;
        }
    }
}

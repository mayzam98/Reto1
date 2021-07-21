/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author mayko
 */
public class bajoRadar {

    public bajoRadar() {
    }
    
    
    
    public String multarVelocidad(float distanciaUno, float distanciaDos, float tiempo){
        System.out.println("\n---------------------------------------");
        
        
        Scanner in = new Scanner(System.in);
        
        String textoMulta = "";
        String texto2;
        float distancia = distanciaDos-distanciaUno;
        float tiempoHoras = tiempo / 60;
        float distanciaKm = distancia / 1000;
        float velocidad = distanciaKm / tiempoHoras;
        if (velocidad > 1 && velocidad <= 20)
          textoMulta="llamado de atención por baja velocidad";
        else if (velocidad >= 21 && velocidad <= 60)
          textoMulta="Normal";  
        else if (velocidad >= 61 && velocidad <= 80)
          textoMulta="llamado de atención por alta velocidad";
        else if (velocidad >= 81 && velocidad <= 120){

          System.out.println("Ingrese el resultado prueba de alcoholemia(mg de etanol/l00 ml): ");
          float alcohol = in.nextFloat();
          System.out.println("\n---------------------------------------");
          texto2 = multarAlcoholemia(alcohol);
          textoMulta="multa tipo I\n"+texto2;
                  }
        else if (velocidad >120){
          System.out.println("Ingrese el resultado prueba de alcoholemia(mg de etanol/l00 ml): ");
          float alcohol = in.nextFloat();
          System.out.println("\n---------------------------------------");
          texto2 = multarAlcoholemia(alcohol);
          textoMulta="multa tipo II e inmovilización del vehículo.\n"+texto2;
                  }
        return textoMulta;
    }
    
    private String multarAlcoholemia(float gradoAlcohol){
        Scanner in = new Scanner(System.in);
        
        String textoMulta ="";
        String texto2;
        
        if (gradoAlcohol < 20)
            textoMulta = "";
        else if (gradoAlcohol >= 20 && gradoAlcohol <=39)
            textoMulta="Entre 20 y 39 mg de etanol/l00 ml de sangre total, además de las sanciones previstas en la presente ley, se decretará la suspensión de la licencia de conducción entre seis (6) y doce (12) meses.";
        else if (gradoAlcohol >= 40 && gradoAlcohol <=99)
            textoMulta="Primer grado de embriaguez entre 40 y 99 mg de etanol/100 ml de sangre total, adicionalmente a la sanción multa, se decretará la suspensión de la Licencia de Conducción entre uno (1) y tres (3) años.";
        else if (gradoAlcohol >= 100 && gradoAlcohol <= 149)
            textoMulta="Segundo grado de embriaguez entre 100 y 149 mg de etanol/100 ml de sangre total, adicionalmente a la sanción multa, se decretará la suspensión de la Licencia de Conducción entre tres (3) y cinco (5) años, y la obligación de realizar curso de sensibilización, conocimientos y consecuencias de la alcoholemia y drogadicción en centros de rehabilitación debidamente autorizados, por un mínimo de cuarenta (40) horas.";
        else if (gradoAlcohol >= 150)
            textoMulta="Tercer grado de embriaguez, desde 150 mg de etanol/100 ml de sangre total en adelante, adicionalmente a la sanción de la sanción de multa, se decretará la suspensión entre cinco (5) y diez (10) años de la Licencia de Conducción, y la obligación de realizar curso de sensibilización, conocimientos y consecuencias de la alcoholemia y drogadicción en centros de rehabilitación debidamente autorizados, por un mínimo de ochenta (80) horas.";
        return textoMulta;
    }
}


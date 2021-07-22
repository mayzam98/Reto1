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
public class ClsEspaciosDeColor {
    
    
  private float[] convertir_yiq_a_rva(float y, float i, float q){
  float r =(float) (y+0.955*i+0.618*q);
  float v =(float) ( y-0.271*i-0.645*q);
  float a =(float) ( y-1.11*i+1.7*q);
  float[] retorno = {r,v,a};
  return retorno;
          }
    
  private float[] convertir_yiq_a_ycbcr(float y1,float i,float q){
  
  //Se hace aqui la conversión intermedia
  float r =(float) (y1+0.955*i+0.618*q);
  float v =(float) (y1-0.271*i-0.645*q);
  float a =(float) (y1-1.11*i+1.7*q); 
  
  //Se hace aqui la conversión que se pide
  float y =(float) (0.299*r+0.587*v+0.114*a);
  float cb =(float) (0.1687*r-0.3313*v-0.5*a);
  float cr =(float) (0.5*r-0.418*v+0.0813*a);
  float[] retorno = {y,cb,cr};     
  return retorno;
          }
  private float[] convertir_rva_a_yiq(float r,float v,float a){
  float y,i,q;
  y = (float) (0.299*r+0.587*v+0.114*a);
  i = (float) (0.596*r-0.275*v-0.321*a);
  q = (float) (0.212*r-0.528*v+0.311*a);
  float[] retorno = {y,i,q}; 
  return retorno;
          }
  
  
  private float[] convertir_rva_a_ycbcr(float r,float v,float a){
  
  float y = (float) (0.299*r+0.587*v+0.114*a);
  float cb = (float) (0.1687*r-0.3313*v-0.5*a);
  float cr = (float) (0.5*r-0.418*v+0.0813*a);
  float[] retorno = {y,cb,cr};
  return retorno;
          }
    
  
  private float[] convertir_ycbcr_a_yiq(float y1,float cb,float cr){
  
  //Se hace aqui la conversión intermedia
  float r =(float) (1*y1+0*cb+1.402*cr);
  float v =(float) ( 1*y1+0.344*cb-0.714*cr);
  float a =(float) ( 1*y1+1.772*cb+0*cr);
  //Se hace aqui la conversión que se pide
  float y =(float) ( 0.299*r+0.587*v+0.114*a);
  float i =(float) ( 0.596*r-0.275*v-0.321*a);
  float q =(float) ( 0.212*r-0.528*v+0.311*a);
  float[] retorno = {y,i,q}; 
  return retorno;
  }
  
  
  private float[] convertir_ycbcr_a_rva(float y,float cb,float cr){
  
  float r = (float) (1*y+0*cb+1.402*cr);
  float v = (float) (1*y+0.344*cb -0.714*cr);
  float a = (float) (1*y+1.772*cb +0*cr);
  float[] retorno= {r,v,a};
  return  retorno;
  }
  
  public void convertir(){
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("Digite el valor de r:");
      float r = in.nextFloat();
      System.out.println("Digite el valor de v:");
      float v = in.nextFloat();
      System.out.println("Digite el valor de a:");
      float a = in.nextFloat();
      
      
      System.out.println("Digite el valor de Y:");
      float y = in.nextFloat();
      System.out.println("Digite el valor de I:");
      float i = in.nextFloat();
      System.out.println("Digite el valor de Q:");
      float q = in.nextFloat();
      
      System.out.println("Digite el valor de y:");
      float yc = in.nextFloat();
      System.out.println("Digite el valor de cb:");
      float cb = in.nextFloat();
      System.out.println("Digite el valor de cr:");
      float cr = in.nextFloat();
      
      
      
      float[] yiq_rva = convertir_yiq_a_rva(y, i, q);
      System.out.println("la conversión de yiq a rva es "+"r="+yiq_rva[0]+"v="+yiq_rva[1]+"a="+yiq_rva[2]);
      
      float[] yiq_ycbcr = convertir_yiq_a_ycbcr(y,i,q);
              
      System.out.println("la conversión de yiq a ycbcr es"+"y="+yiq_ycbcr[0]+"cb="+yiq_ycbcr[1]+"cr="+yiq_ycbcr[2]);
  
      float[] rva_yiq = convertir_rva_a_yiq(r,v,a);
      System.out.println("la conversión de rva a yiq es"+"y="+rva_yiq[0]+"i="+rva_yiq[1]+"q="+rva_yiq[2]);
      
      float[] rva_ycbcr = convertir_rva_a_ycbcr(r,v,a);
      System.out.println("la conversión de rva a ycbcr es"+"y="+rva_ycbcr[0]+"cb="+rva_ycbcr[1]+"cr="+rva_ycbcr[2]);
      
      float[] ycbcr_yiq = convertir_ycbcr_a_yiq(y,cb,cr);
      System.out.println("la conversión de ycbcr a yiq es"+"y="+ycbcr_yiq[0]+"i="+ycbcr_yiq[1]+"q="+ycbcr_yiq[2]);
      
      float[] ycbcr_rva = convertir_ycbcr_a_rva(y,cb,cr);
      System.out.println("la conversión de ycbcr a rva es"+"r="+ycbcr_rva[0]+"v="+ycbcr_rva[1]+"a="+ycbcr_rva[2]);
  }
}

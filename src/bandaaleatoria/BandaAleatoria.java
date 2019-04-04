/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ESTEFA
 */
public class BandaAleatoria {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        int numIntegrantes=  (int) (Math.random()*19);
        int n=numIntegrantes;  //numeros aleatorios
        int k=n;  //auxiliar;
        int[] numeros=new int[n];
        int[] resultado=new int[n];
        Random rnd=new Random();
        int res;

        for(int i=0;i<n;i++){
            numeros[i]=i+1;
        }
        
        for(int i=0;i<n;i++){
            res=rnd.nextInt(k);            
            resultado[i]=numeros[res];
            numeros[res]=numeros[k-1];
            k--;
            
        }
        System.out.println(numIntegrantes);
System.out.println("El resultado de la matriz es:");
        for(int i=0;i<n;i++){
        System.out.println(resultado[i]);
        
        }
        
   }
   
        
        
        
        
      
    
}
   


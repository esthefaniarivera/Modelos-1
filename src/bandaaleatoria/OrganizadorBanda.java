/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria;
import java.util.Random;
/**
 *
 * @author ESTEFA
 */
public class OrganizadorBanda {
    
   Musico musico= new Musico();
   String[] m= new String[20];
   
   Instrumento ins= new Instrumento();
   String [] i= new String[4];
   
   
   
   
   public int[] ordenMusico(){
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
        return resultado;
        
        }
        
   }
   
   
    
        


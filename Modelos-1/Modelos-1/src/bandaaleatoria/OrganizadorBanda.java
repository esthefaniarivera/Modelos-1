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
public class OrganizadorBanda {
    
   Musico musico= new Musico();
   String[] m= new String[20];
   
   Instrumento ins= new Instrumento();
   String [] i= new String[4];
      
   
   
   int numIntegrantes=  (int) (Math.random()*20)+1;
     
   public String[] OrganizadorInstrumentos(){
        String[] asignar= new String[numIntegrantes]; 
        i=ins.LlenarInstrumento();
        
        for (int j = 0; j <= numIntegrantes; j++) {
          
           int aleatorioInstrumento = (int) (Math.random()*4)+1;
           asignar[j]= i[aleatorioInstrumento];
            System.out.println(asignar[j]);
                          
       }
       return asignar;
              
   }
    public String[] Organizador(){
       m=musico.LlenarMusico();
       String[] bandaCompleta= new String[numIntegrantes];
       i=ins.LlenarInstrumento();
       
       for (int j = 0; j <= numIntegrantes; j++) {
           bandaCompleta[j]=m[j];
           System.out.println(bandaCompleta[j]);
           
           
                          
       }
    return bandaCompleta;
   }
   
   public String[] ArmarBanda(){
       String[] banda= new String[numIntegrantes]; 
       String[] instru= new String[numIntegrantes]; 
       banda=Organizador();
       instru=OrganizadorInstrumentos();
       String[] laBanda= new String[numIntegrantes]; 
       for (int k = 0; k <= numIntegrantes; k++) {
           laBanda[k]=banda[k]+instru[k];
           System.out.println();
           System.out.println(laBanda[k]);
       }
       return laBanda;
       
   }
   
}   
       
   
   
   
        

   
   
   
    
        


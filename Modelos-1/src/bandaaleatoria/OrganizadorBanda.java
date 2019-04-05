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
      
   
   
   int numIntegrantes=  (int) (Math.random()*20);
   
   
   
   public String[] Organizador(){
       m=musico.LlenarMusico();
       String[] bandaCompleta= new String[numIntegrantes];

       
       for (int i = 0; i < numIntegrantes; i++) {
           bandaCompleta[i]= m[i];       
           //System.out.println(bandaCompleta[i]);              
       }
       return bandaCompleta;
   }
   
   public String[] OrganizadorInstrumentos(){
        String[] asignar= new String[numIntegrantes]; 
        i=ins.LlenarInstrumento();
        
        for (int j = 0; j < numIntegrantes; j++) {
          
           int aleatorioInstrumento = (int) (Math.random()*3)+1;
           asignar[j]= i[aleatorioInstrumento];
           //System.out.println(asignar[j]);
                          
       }
       return asignar;
       
       
       
   }
   public void  GestionarBanda(){
       String[] banda=new String[Organizador().length]; 
       String[] instru=new String[OrganizadorInstrumentos().length];
       banda=Organizador();
       instru=OrganizadorInstrumentos();
       String[] laBanda=new String[numIntegrantes]; 
       
       for (int j = 0; j < numIntegrantes; j++){
           
           laBanda[j]=banda[j]+": "+instru[j];
           System.out.println(laBanda[j]);
       }
       for (int j = 0; j < numIntegrantes; j++){
           
           laBanda[j]=banda[j]+" Afinando "+instru[j];
           System.out.println(laBanda[j]);
       }
       for (int j = 0; j < numIntegrantes; j++){
           
           laBanda[j]=banda[j]+" Tocando "+instru[j];
           System.out.println(laBanda[j]);
       }
       
   }
   
}


        


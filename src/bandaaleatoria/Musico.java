/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria;

/**
 *
 * @author ESTEFA
 */
public class Musico {
    String miembro[]= new String[20];
    int n=1;
    
//arreglo de musico    
public String[] LlenarMusico(){    
for (int i=0;i<20;i++){
    miembro [i]="musico " + n;
    n++;   
}
        return miembro;
}  
}
package bandaaleatoria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*import bandaaleatoria.Cuerdas;
import bandaaleatoria.Percusion;
import bandaaleatoria.Viento;
import bandaaleatoria.Voz;*/




/**
 *
 * @author ESTEFA
 */
public class Instrumento {
    //Creamos Los objetos de cada instrumento.
    Cuerdas guitarra = new Cuerdas();
    Viento trompeta = new Viento();
    Voz canto = new Voz();
    Percusion tambor = new Percusion();
   
    //Llenar array de instrumentos.
    public String[] LlenarInstrumento(){
        String[] instrumento = new String[4];
        instrumento[0] = guitarra.tipo ;   
        instrumento[1] = trompeta.tipo ;
        instrumento[2] = canto.tipo ;
        instrumento[3] = tambor.tipo ;
        
        return instrumento;
    }
}
    
    

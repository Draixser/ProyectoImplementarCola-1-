/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author keanz
 */
public class operacionesCola {
    public class OperacionesCola <T extends Base> {
        <T extends Base> Cola<T> duplicarCola(Cola<T> COL){
        
        Cola<T> colaAux=new Cola<>();
        Cola<T> duplicarCola = new Cola();
        
        while (!COL.estaVacia()){
            T elemento=COL.desencolar();
            colaAux.encolar(elemento);
        }
        while (!colaAux.estaVacia()){
            T elemento = colaAux.desencolar();
            T elementoCopiado=(T) elemento.copy();
            
            COL.encolar(elemento);
            duplicarCola.encolar(elementoCopiado);
            
             return duplicarCola;
        }
       
        
         return colaAux;
    }
    
}

}

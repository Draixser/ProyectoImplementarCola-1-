
/**
* Descripción de la clase …
* @author david.roa@uao.edu.co David Santiago Roa Código 2215926
* @author kevin.zambrano@uao.edu.co Kevin Andres Zambrano  Código 2200374
* @date 12 Agosto2014
* @version 1.0
*/
package vista;




import datos.Caja;
import datos.Clientes;

import modelo.Cola;

/**
 *
 * @author Alejo-PC
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola<Clientes> colaCarros = new Cola<>();
        Caja[] Cajeros = new Caja[4];
        for(int i = 0; i < 4; i++){
            Cajeros[i] = new Caja(i + 1);
        }
       
        while (true) {
            for (Caja caja : Cajeros){
                if(!caja.isEstado() && !colaCarros.estaVacia()){
                    Clientes carros = colaCarros.desencolar();
                    caja.atenderCarro(carros);}
            }
            
        }
        
        }
    }

    


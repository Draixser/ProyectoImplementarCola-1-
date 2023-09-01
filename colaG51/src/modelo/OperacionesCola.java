
/**
* Descripción de la clase …
* @author david.roa@uao.edu.co David Santiago Roa Código 2215926
* @author kevin.zambrano@uao.edu.co Kevin Andres Zambrano  Código 2200374
* @date 12 Agosto2014
* @version 1.0
*/

package modelo;

import datos.Clientes;

public class OperacionesCola<T extends Base> {


    public static Cola<Clientes> duplicarCola(Cola<Clientes> COL) {
        Cola<Clientes> colaAux = new Cola<>();
        Cola<Clientes> duplicarCola = new Cola<>();

        while (!COL.estaVacia()) {
            Clientes elemento = COL.desencolar();
            colaAux.encolar(elemento);
        }

        while (!colaAux.estaVacia()) {
            Clientes elemento = colaAux.desencolar();
            Clientes elementoCopiado = (Clientes) elemento.copy();

            COL.encolar(elemento);
            duplicarCola.encolar(elementoCopiado);
        }

        return duplicarCola;
    }
}
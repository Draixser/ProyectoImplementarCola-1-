



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
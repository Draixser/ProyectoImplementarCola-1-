/**
* Descripción de la clase …
* @author david.roa@uao.edu.co David Santiago Roa Código 2215926
* @author
* @date 12 Agosto2014
* @version 1.0
*/

package modelo;


import datos.Caja;

import datos.Clientes;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class Cola<T extends Base> {
    
    private static final String[] modelos = {"REF467", "RQWE12", "ASD322"};
    private static final String[] nombres = {"DER", "TRED", "FMNM"};
    private static final String [] estadoCaja = {"Libre", "Ocupado"};
    private static final Random random = new Random(); 
    private Queue<T> cola;

    public Cola() {
        cola = new LinkedList<>();
    }

    public void encolar(T elemento) {
        cola.add(elemento);
    }

    public T desencolar() {
        return cola.remove();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }
    public static Clientes generearCarroAleatorio(){
        String modeloAleatorio = modelos[random.nextInt(modelos.length)];
        String nombreAleatorio = nombres[random.nextInt(nombres.length)];
        int tiempoEsperaAleatorio = 1 + random.nextInt(6);
        
        return new Clientes(nombreAleatorio, modeloAleatorio, tiempoEsperaAleatorio);
        }
        
        public static Caja CajaAleatoria(){
       
        int edadClientes = 18 + random.nextInt(42);
        int numClientes = 0;
        int tiempoTransaccion = 1 + random.nextInt(6);
        Boolean estadoDeCaja = null;
        
        
        return new Caja(estadoDeCaja,edadClientes,numClientes,tiempoTransaccion);
        
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (T elemento : cola ) {
            sb.append("").append(elemento.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}

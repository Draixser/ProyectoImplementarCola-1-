 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Clientes;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author Alejo-PC
 */
public class Cola<T extends Base> {
    
    private static final String[] modelos = {"REF44", "RFEW3", "FEE33"};
    private static final String[] nombres = {"FREW", "RFEW", "FGTS"};
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

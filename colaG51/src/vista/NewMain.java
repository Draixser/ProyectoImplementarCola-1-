/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;



import datos.Clientes;
import datos.Receptor;
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
        Receptor[] receptores = new Receptor[4];
        for(int i = 0; i < 4; i++){
            receptores[i] = new Receptor(i + 1);
        }
       
        while (true) {
            for (Receptor receptor : receptores){
                if(!colaCarros.estaVacia() && !receptor.ocupado()){
                    Clientes carros = colaCarros.desencolar();
                    receptor.atenderCarro(carros);}
            }
            
        }
        
        }
    }

    


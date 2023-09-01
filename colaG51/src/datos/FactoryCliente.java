
/**
* Descripción de la clase …
* @author david.roa@uao.edu.co David Santiago Roa Código 2215926
* @author kevin.zambrano@uao.edu.co Kevin Andres Zambrano  Código 2200374
* @date 12 Agosto2014
* @version 1.0
*/


package datos;


import datos.Clientes;




public class FactoryCliente {
    public static Clientes create() {

        String nombreAleatorio = "NombreAleatorio"; // Reemplaza con lógica real
        String modeloAleatorio = "ModeloAleatorio"; // Reemplaza con lógica real
        int tiempoEsperaAleatorio = 0; // Reemplaza con lógica real

        return new Clientes(nombreAleatorio, modeloAleatorio, tiempoEsperaAleatorio);
    }
}
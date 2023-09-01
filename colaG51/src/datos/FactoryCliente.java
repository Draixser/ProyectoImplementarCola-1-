package datos;


import datos.Clientes;




public class FactoryCliente {
    public static Clientes create() {
        // Aquí puedes implementar la lógica para crear y retornar una instancia de Clientes
        // Por ejemplo:
        String nombreAleatorio = "NombreAleatorio"; // Reemplaza con lógica real
        String modeloAleatorio = "ModeloAleatorio"; // Reemplaza con lógica real
        int tiempoEsperaAleatorio = 0; // Reemplaza con lógica real

        return new Clientes(nombreAleatorio, modeloAleatorio, tiempoEsperaAleatorio);
    }
}
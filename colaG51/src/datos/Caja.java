/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import modelo.Base;

/**
 *
 * @author Usuario
 */
public class Caja extends Base{
  
    private Boolean Ocupado;
    private int tiempoTransaccion;
    private int edadCliente;
    private int numClientes;
    private Clientes carroActual;
    private int id;

    public Caja() {
    }

        public Caja(int i) {
        this.Ocupado = false;
        this.tiempoTransaccion = 0;
        this.edadCliente = 0;
        this.numClientes = 0;
    }

    public Caja(Boolean estadoDeCaja, int edadClientes, int numClientes, int tiempoTransaccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


  
    
  
    public void atenderCarro(Clientes Carro){
        this.Ocupado=true;
        this.carroActual = Carro;
        this.tiempoTransaccion += Carro.getTiempoEsperaAleatorio();
        this.numClientes++;
        
    }

    public void finalizarServicio(){
    this.Ocupado = false;
    this.carroActual= null;
    

    }
    // Getters and setters
    public Boolean isEstado() {
        return Ocupado;
    }

    public void setEstado(boolean estado) {
        this.Ocupado = estado;
    }

    public int getTiempoTransaccion() {
        return tiempoTransaccion;
    }

    public void setTiempoTransaccion(int tiempoTransaccion) {
        this.tiempoTransaccion = tiempoTransaccion;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    public int getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    @Override
    public String toString() {
        return "Caja{" + "estado=" + Ocupado + ", tiempoTransaccion=" + tiempoTransaccion + ", edadCliente=" + edadCliente + ", numClientes=" + numClientes + '}';
    }

    @Override
    public Base copy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


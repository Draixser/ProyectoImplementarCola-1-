/**
* Descripción de la clase …
* @author david.roa@uao.edu.co David Santiago Roa Código 2215926
* @date 12 Agosto2014
* @version 1.0
*/

package datos;

import modelo.Base;



public class Clientes extends Base {
    private String nombreAleatorio;
    private String modeloAleatorio;
    private int tiempoEsperaAleatorio;

    public Clientes() {
    }

    public Clientes(String nombreAleatorio, String modeloAleatorio, int tiempoEsperaAleatorio) {
        this.nombreAleatorio = nombreAleatorio;
        this.modeloAleatorio = modeloAleatorio;
        this.tiempoEsperaAleatorio = tiempoEsperaAleatorio;
    }


    public String getNombreAleatorio() {
        return nombreAleatorio;
    }

    public void setNombreAleatorio(String nombreAleatorio) {
        this.nombreAleatorio = nombreAleatorio;
    }

    public String getModeloAleatorio() {
        return modeloAleatorio;
    }

    public void setModeloAleatorio(String modeloAleatorio) {
        this.modeloAleatorio = modeloAleatorio;
    }

    public int getTiempoEsperaAleatorio() {
        return tiempoEsperaAleatorio;
    }

    public void setTiempoEsperaAleatorio(int tiempoEsperaAleatorio) {
        this.tiempoEsperaAleatorio = tiempoEsperaAleatorio;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombreAleatorio=" + nombreAleatorio + ", modeloAleatorio=" + modeloAleatorio + ", tiempoEsperaAleatorio=" + tiempoEsperaAleatorio + '}';
    }

    @Override
    public Base copy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

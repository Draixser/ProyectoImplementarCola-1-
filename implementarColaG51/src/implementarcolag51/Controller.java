/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementarcolag51;

import datos.Carro;
import datos.Clientes;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ResourceBundle;
import java.util.Timer;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.util.Duration;
import modelo.Cola;

/**
 *
 * @author Alejo-PC
 */
public class Controller implements Initializable {

    @FXML
    private Label tituloL;
    @FXML
    private Label nombrePL;
    @FXML
    private Label correoPL;
    @FXML
    private Label numPL;

    @FXML
    private TextField nombreTXT;
    @FXML
    private TextField correoTXT;
    @FXML
    private TextField numTXT;
    @FXML
    private TextArea mostrarTAXT;
    @FXML
    private WebView webViewCola;
    @FXML
    private WebEngine WebEngineCola;
    
    private Cola<Clientes>cola;
    private LinkedList<Caja> cajero;
    private Timer timer;
    private int EngineCajeros;
    private int EngineCola;
    private String htmlCola;
    private String htmlCajeros;
    private int sumaCaja1;
    private int sumaCaja2;
    private int sumaCaja3;
    private int sumaCaja4;
    private int sumaCaja5;
    private int sumaCaja6;
    private int tiempoTotal;
    private Timeline t;
    String numClientes;
    
    Cola<Carro> colaCarro;
    private String sumaCajero;

    @FXML
    private void encolarPersonas(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");

        String nombreP = nombreTXT.getText();
        String correoP = correoTXT.getText();
        String numP = numTXT.getText();

        colaCarro.encolar(new Carro(nombreP, correoP, numP));
    }

     @FXML
    private void mostrarPersonas(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");

        mostrarTAXT.setText(colaCarro.toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        // ...
        colaCarro = new Cola<>();
        cajero = new LinkedList<>();
        for(int i - 0; i <= 5; i++)
        {
            cajero.add(new Caja());
        }
        System.out.println(cajero.toString);
        
        t = new Timeline(new KeyFrame (Duration.millis(5000),
                new EventHandler<ActionEcent>(){
            public void handle(ActionEvent event){
                hacerQueTodoFuncione();     
            }

   

   
        }));
        t.setCycleCount(Animation.INDEFINITE);
        
        WebEngineCola = webViewCola.getEngine();
        webEngineCajeros = webEngineCajeros.getEngine();
        
        sumaCajero = "<table border=1 width=100%><tr>"; 
                
        sumaCaja1= 0;
        sumaCaja2= 0;
        sumaCaja3= 0;
        sumaCaja4= 0;
        sumaCaja5= 0;
        sumaCaja6= 0;
        
        }
    private void hacerQueTodoFuncione(){
        crearCliente();
        revisarCajerosLibres();
        tiempoTotal++;
        getEngineCola.loadContent(hacerHtmlCola());
        getEngineCajeros.loadContent(hacerHtmlCajeros());
    }
    private void crearCliente() {
        int  numCliente = (int)(Math.random() * 2);
        System.out.println("Se crearon" + numClientes +);
        for (int i = 0; i < numClientes; i++){
        Clientes  c = FactoryCliente.create();
        cola.encolar(c);
    }
    }
    private void revisarCajerosLibres() {
        System.out.println("Atender clientes");
        for(Iterator<Caja> itCaja = cajero.Iterator(); itCaja,hasNext());{
        Caja caja = itCaja.next();
        if (caja.isEstado() && !cola.estaVacia()){
            Clientes c = cola.desencolar();
            
            caja.setEstado(false);
            caja.setTiempoTransaccion(c.getTiempoTransaccion());
            caja.setEdadCliente(c.getEdadCliente());
            caja.setNumClientes(caja.getNumClientes());
        }
        else{
            if (caja.gerTiempoTransaccion() > 0){
                caja.getTiempoTransaccion(caja.getTiempoTransaccion - 1);
                
                if(caja == cajero.get(0)){
                    sumaCaja1++;
                }
                else if(caja == cajero.get(1)){
                    sumaCaja2++;
                }
                else if(caja == cajero.get(2)){
                    sumaCaja3++;
                }
                else if(caja == cajero.get(3)){
                    sumaCaja4++;
                }
                else if(caja == cajero.get(4)){
                    sumaCaja5++;
                }
                else if(caja == cajero.get(5)){
                    sumaCaja6++;
                }
            }
                
        }
    }
   
}

            
}    

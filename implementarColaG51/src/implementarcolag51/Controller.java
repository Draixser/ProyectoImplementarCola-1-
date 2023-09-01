
/**
* Descripción de la clase …
* @author david.roa@uao.edu.co David Santiago Roa Código 2215926
* @author kevin.zambrano@uao.edu.co Kevin Andres Zambrano  Código 2200374
* @date 12 Agosto2014
* @version 1.0
*/

package implementarcolag51;



import datos.Caja;
import datos.FactoryCliente;
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.util.Duration;
import modelo.Cola;


public class Controller implements Initializable {

  

    private Button Empezar;
    @FXML
    private Button Detener;
    @FXML
    private WebView webViewCola;
     @FXML
    private WebView webViewCajeros;
    @FXML
    private WebEngine WebEngineCola;
    @FXML
    private WebEngine WebEngineCajeros;
    
    
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
    
    Cola<Clientes> colaCarro;
    private String sumaCajero;

    @FXML
    private void encolarPersonas(ActionEvent event) {

    }

     @FXML
    private void mostrarPersonas(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        // ...
        cola = new Cola<>();
        cajero = new LinkedList<>();
        for(int i = 0; i <= 5; i++)
        {
            cajero.add(new Caja());
        }
        System.out.println(cajero.toString());
        
        
        
             
    
        t = new Timeline(new KeyFrame (Duration.millis(5000),
                new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                hacerQueTodoFuncione();     
            }

   
                
   
        }));
        t.setCycleCount(Animation.INDEFINITE);
        
        ///WebEngineCola = webViewCola.getEngine();
       // WebEngineCajeros = webViewCajeros.getEngine();
        
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
    
    
    //WebEngineCola.loadContent(hacerHtmlCola());
    //WebEngineCajeros.loadContent(hacerHtmlCajeros());
    }
    
    private void empezar(){
    t.play();
    }
    
    
    private void detener(){
    t.stop();
    }
    
    
    private void crearCliente() {
        int  numCliente = (int)(Math.random() * 2);
       
        System.out.println("Se crearon" + numCliente );
    
        for (int i = 0; i < numCliente; i++){
        Clientes  c = FactoryCliente.create();
        cola.encolar(c);
    }
    }
    private void revisarCajerosLibres() {
        System.out.println("Atender clientes");
    
       for (Iterator<Caja> itCaja = cajero.iterator(); itCaja.hasNext();) {
        Caja caja = itCaja.next();
        if (caja.isEstado() && !cola.estaVacia()){
            Clientes c = cola.desencolar();
            
            caja.setEstado(false);
            caja.setTiempoTransaccion(c.getTiempoEsperaAleatorio());
            caja.setEdadCliente(c.getTiempoEsperaAleatorio());
            caja.setNumClientes(caja.getNumClientes());
        }
        else{
            if (caja.getTiempoTransaccion() > 0){
                caja.setTiempoTransaccion(caja.getTiempoTransaccion() - 1);
                
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

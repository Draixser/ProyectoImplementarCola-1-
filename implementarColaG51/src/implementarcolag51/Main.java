
/**
* Descripción de la clase …
* @author david.roa@uao.edu.co David Santiago Roa Código 2215926
* @author kevin.zambrano@uao.edu.co Kevin Andres Zambrano  Código 2200374
* @date 12 Agosto2014
* @version 1.0
*/

package implementarcolag51;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

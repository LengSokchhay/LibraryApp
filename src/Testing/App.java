package Testing;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
      
        Parent root = FXMLLoader.load(getClass().getResource("Homepage.fxml"));
        stage.setTitle("Welcome to Library App");
        stage.setScene(new Scene(root));
        stage.show();   
    }
    
   public static void main(String[] args) {launch(args);}
}

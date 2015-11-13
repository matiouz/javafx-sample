package jfxsample;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(Main.class, (java.lang.String[])null);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            // Basic version, to create a form (in case we don't need a reference to the Controller):
            //HBox page = FXMLLoader.load(Main.class.getResource("simple.fxml"));

            // If we need the Controller:
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("simple.fxml"));
            HBox page = loader.load();
            Controller controller = loader.getController();

            // FXMLLoader.load() also creates the controller and calls its initialize method

            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.setTitle("My FXML sample");
            primaryStage.show();

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

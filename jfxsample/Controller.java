package jfxsample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="myTextField"
    private TextField myTextField; // Value injected by FXMLLoader

    @FXML // fx:id="myButton"
    private Button myButton; // Value injected by FXMLLoader

    @FXML // fx:id="myLabel"
    private Label myLabel; // Value injected by FXMLLoader


    public Controller(){
        System.out.println("Constructeur");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert myTextField != null : "fx:id=\"myTextField\" was not injected: check your FXML file 'simple.fxml'.";
        assert myButton != null : "fx:id=\"myButton\" was not injected: check your FXML file 'simple.fxml'.";
        assert myLabel != null : "fx:id=\"myLabel\" was not injected: check your FXML file 'simple.fxml'.";

        myButton.setOnAction(event -> {
            System.out.println("Btn clicked");
            myLabel.setText(myTextField.getText());
        });

        myTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            myLabel.setText(newValue);
        });
    }
}

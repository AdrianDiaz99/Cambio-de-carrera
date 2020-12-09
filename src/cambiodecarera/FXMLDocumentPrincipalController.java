/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiodecarera;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author adria
 */
public class FXMLDocumentPrincipalController implements Initializable {
    
    @FXML
    private void evtBtnConsultar(ActionEvent event) {
        System.out.println("Consultar");
    }
    
    @FXML
    private void evtBtnCancelar(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Recuperar Contraseña");
        alert.setHeaderText("");
        alert.setContentText("Su contraseña es su CURP");
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("file:icono.PNG"));
        alert.showAndWait();
    }
    
    @FXML
    private void evtBtnNvaSol(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Recuperar Contraseña");
        alert.setHeaderText("");
        alert.setContentText("Su contraseña es su CURP");
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("file:icono.PNG"));
        alert.showAndWait();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

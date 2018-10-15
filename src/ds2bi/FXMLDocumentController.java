/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2bi;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.Mnemonic;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author kyokuto
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane anchorPaneBase;

    @FXML
    private MenuButton menuButtonBank;

    @FXML
    private MenuItem mu;

    @FXML
    private MenuItem ms;

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @FXML
    private Button fileChoice;

    @FXML
    void handlefileChoiceButtonAction(ActionEvent event) {
        System.out.println("File Choice");
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("FileChooser");
        fileChooser.getExtensionFilters().addAll(
        new FileChooser.ExtensionFilter("csv file", "*.csv","*.CSV"));
        File file = fileChooser.showOpenDialog(null);
        System.out.println(String.valueOf(file));    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}

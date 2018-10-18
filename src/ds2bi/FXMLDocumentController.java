/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds2bi;

import entity.ItemDAO;
import entity.ItemEntity;
import entity.TestRead;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
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
    private Button fileChoice;

    @FXML
    private TextField txtfldSlipNumber;
    
    @FXML
    private Button btnIb_A;

    @FXML
    private Button btnIb_B;

    @FXML
    private Button btnIb_C;

    @FXML
    private Button btnIb_D;

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }

    @FXML
    void handlefileChoiceButtonAction(ActionEvent event) throws IOException {
        System.out.println("File Choice");
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("FileChooser");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("csv file", "*.csv", "*.CSV"));
        File file = fileChooser.showOpenDialog(null);
        System.out.println(String.valueOf(file));
        ItemDAO.registerList(file);
            }
   
    @FXML
           void workIb_A(){
               System.out.println("A");
                testWork("062");
            }
   
    @FXML
    private void testWork(String iB){
        Iterator<ItemEntity>iterator = ItemDAO.selectItemEntity(txtfldSlipNumber.getText());
        while(iterator.hasNext()){
           ItemEntity itemEntity = iterator.next();
           System.out.println(itemEntity.getItemSeq()+"-"+itemEntity.getBorrowingClassification());
       }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}

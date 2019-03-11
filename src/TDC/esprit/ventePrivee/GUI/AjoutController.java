/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TDC.esprit.ventePrivee.GUI;

import static TDC.esprit.ventePrivee.GUI.authAdminController.idUser;
import TDC.esprit.ventePrivee.classes.ServiceDao_1;
import TDC.esprit.ventePrivee.interfaces.IServiceDao;
import TDC.esprit.ventePrivee.entities.Service;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Chedli
 */

public class AjoutController {
    @FXML
    private Label label;
    @FXML
    private TextArea desc;
    @FXML
    private TextField durree;
    private TextField note;
    private TextField date;
    @FXML
    private TextField lieu;
    @FXML
    private Button btnAjout;
    @FXML
    private Button btnretour;
    @FXML
    private DatePicker date_val;
    @FXML
    private ComboBox<String> note_val;

    
     
   
public void ViderChamps(){
        
        desc.clear();
        durree.clear();
        lieu.clear();
//        date.setText(null);
        //date.setText(" ");
       // note_val.setValue(" ");
       // note_val.setValue(null);
    }

 @FXML
    private void AjoutAction(ActionEvent event) {

        String itemNote=String.valueOf(note_val.getSelectionModel().getSelectedItem());
        String itemDate=((TextField)date_val.getEditor()).getText();
        
    Service service=new Service();
    service.setDescription(desc.getText());
    service.setDuree(durree.getText());
    service.setLieu(lieu.getText());
    service.setDate_ajout(itemDate);
    service.setNote_evaluation(itemNote);
    service.setIdUser(idUser);
   IServiceDao serviceDao = new ServiceDao_1();
        serviceDao.addService(service);
        
           ViderChamps();
           
    }
    @FXML
    private void retour(ActionEvent event) throws IOException {
         Stage stage = null ;
        Parent root = null ;
        
        if (event.getSource()==btnretour){
             //get reference to the button's stage
            stage=(Stage) btnretour.getScene().getWindow();
             //load up OTHER FXML document
            root=FXMLLoader.load(getClass().getResource("CompteUserPerso.fxml"));
            
        }
        //create a new scene with root and set the stage// Creer un nouveau scène 
         Scene scene=new Scene(root);
         stage.setScene(scene);
         stage.setTitle("Interface Utilisateur");
         stage.show();
    }
    
}

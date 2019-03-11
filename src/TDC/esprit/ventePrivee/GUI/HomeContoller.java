/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.GUI;

import static TDC.esprit.ventePrivee.GUI.authAdminController.idUser;
import TDC.esprit.ventePrivee.classes.ProduitDAO;
import TDC.esprit.ventePrivee.entities.Produit;
import TDC.esprit.ventePrivee.entities.User;
import TDC.esprit.ventePrivee.interfaces.IProduitDAO;
import TDC.esprit.ventePrivee.technique.DataBase;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;

import javafx.beans.property.SimpleStringProperty;

import javafx.beans.value.ObservableValue;

import javafx.collections.FXCollections;

import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

import javafx.scene.Scene;
import javafx.scene.control.Alert;

import javafx.scene.control.TableColumn;

import javafx.scene.control.TableColumn.CellDataFeatures;

import javafx.scene.control.TableView;

import javafx.stage.Stage;

import javafx.util.Callback;


/**
 *
 * @author Edzio
 */
public class HomeContoller extends Application implements Initializable {
    @FXML
    private Button btnIntAjout;
    @FXML
    private Button btnIntAffich;
    private Label labelRouge;
    private Label labelVert;
    private TextField labelSupp;
    @FXML
    private TextField idUserInvisible;
    
    
    Connection c=DataBase.getInstance().getConnection();
    PreparedStatement pst;
    ResultSet res;
    @FXML
    private Button btn_retour;

    @FXML
    private void VersInterfaceAjout(ActionEvent event) throws IOException {
        
        Stage stage = null ;
        Parent root = null ;
        
        if (event.getSource()==btnIntAjout){
             //get reference to the button's stage
            stage=(Stage) btnIntAjout.getScene().getWindow();
             //load up OTHER FXML document
            root=FXMLLoader.load(getClass().getResource("AjouterProduit.fxml"));
            
        }
        //create a new scene with root and set the stage// Creer un nouveau scène 
         Scene scene=new Scene(root);
         stage.setScene(scene);
         stage.setTitle("Interface Ajout Offres Produits");
         stage.show();
         
         
         
        
    }

    @FXML
    private void VersIntAffich(ActionEvent event) throws IOException {
                 
        Stage stage = null ;
        Parent root = null ;
        /*TableView table=new TableView();
        ProduitDAO produit=new ProduitDAO();
        produit.DisplayobservableArrayList();*/
        
       /* IProduitDAO pr=new ProduitDAO();
        TableView table=new TableView();*/
        
        if (event.getSource()==btnIntAffich){
             //get reference to the button's stage
            stage=(Stage) btnIntAffich.getScene().getWindow();
             //load up OTHER FXML document
            root=FXMLLoader.load(getClass().getResource("AfficheListeProduitOffert.fxml"));
         //   pr.DisplayobservableArrayList();
            
        }
        //create a new scene with root and set the stage// Creer un nouveau scène 
         Scene scene=new Scene(root);
         stage.setScene(scene);
         stage.setTitle("Affichage liste des offres produits");
         stage.show();
         
         
          
    }


    private void Exit(ActionEvent event) {
        System.exit(0);
    }

    @Override
    public void start(Stage stage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

      String req="select * from  utilisateur where id_user=?";
        
        try {
            User user=new User();
              
             pst=c.prepareStatement(req);
             pst.setInt(1,idUser);
             // pst.setInt(1,ComboBox_Id.getSelectionModel().getSelectedItem());
             res=pst.executeQuery();
             
             if (res.next()){
                 
                 // champs profil admin
                 idUserInvisible.setText(res.getString("id_user"));
             }
    
            }catch (SQLException ex) {
            Logger.getLogger(HomeContoller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void RetourVersAuthentif(ActionEvent event) throws IOException {
        
        Stage stage=null;
        Parent root=null;
        Alert alert;
        alert=new Alert(Alert.AlertType.INFORMATION);
        
        if (event.getSource()==btn_retour){
             //get reference to the button's stage
            stage=(Stage) btn_retour.getScene().getWindow();
             //load up OTHER FXML document
            root=FXMLLoader.load(getClass().getResource("MenuUser.fxml"));
         //   pr.DisplayobservableArrayList();
               
        alert.setTitle("Etat Deconnexion");
        alert.setHeaderText("Deconnecter de l'Espace Utilisateur");
        alert.setContentText("Merci d'etre un client fidèle du All For Deal,Nous vous Souhaite la Bienvenu");
        alert.showAndWait();
        
            
        }
        //create a new scene with root and set the stage// Creer un nouveau scène 
         Scene scene=new Scene(root);
         stage.setScene(scene);
         stage.setTitle("Interface Authentification All For Deal");
         stage.show();
    }
}

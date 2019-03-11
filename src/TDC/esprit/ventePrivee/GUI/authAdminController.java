/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.GUI;

import TDC.esprit.ventePrivee.entities.Admin;
import TDC.esprit.ventePrivee.technique.DataBase;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.stage.Stage;

/**
 *
 * @author Edzio
 */
public class authAdminController {
    @FXML
    private TextField fieldLogin;
    @FXML
    private PasswordField field_pwd;
    @FXML
    private Button btnConnect;
    @FXML
    private Label labelVerif;
    
    Connection c=DataBase.getInstance().getConnection();
    // pour Admin
    PreparedStatement pst;
    ResultSet res;
   // pour User
    PreparedStatement pstUser;
    ResultSet resUser;
   // Admin
    public static String loginAdmin;
    public static String pwdAdmin;
    // User
    public static String loginUser;
    public static String pwdUser;
    public static int idUser;
    @FXML
    private Button btn_Inscrit;
    @FXML
    private ImageView logoExitAuthen;

    @FXML
    private void seConnecterAction(ActionEvent event) throws IOException {
        
        Stage stage = null ;
        Parent root = null ;
        Alert alertErr;
        alertErr=new Alert(Alert.AlertType.ERROR);
//       int log=Integer.parseInt(fieldLogin.getText());
        
        // requete authentification admin
        String req="select * from user where firstname=? and lastname=?";
        // requete authentification User
        
        
        try {  
            // cas Admin
            pst=c.prepareStatement(req);
            pst.setString(1,fieldLogin.getText());
            pst.setString(2,field_pwd.getText());
            res=pst.executeQuery();
          // cas User
           
            
            
          if (res.next()){
                    labelVerif.setText("Login Successful");
                   
                    loginAdmin=fieldLogin.getText();
                    pwdAdmin=field_pwd.getText();
                    
                    
                   if (event.getSource()==btnConnect){
                     
                       //Admin.id_admin_static=res.getInt("id_admin");
            
               //get reference to the button's stage
            stage=(Stage) btnConnect.getScene().getWindow();
             //load up OTHER FXML document
            root=FXMLLoader.load(getClass().getResource("AdminSpace.fxml"));
              }
              //create a new scene with root and set the stage// Creer un nouveau scène 
                 Scene scene=new Scene(root);
                 stage.setScene(scene);
                 stage.setTitle("Interface Adminsitrateur All For Deal");
                 stage.show();
                 
          }
              //create a new scene with root and set the stage// Creer un nouveau scène 
                 
            
          else{
                     labelVerif.setText("Login Failed");
                     alertErr.setTitle("Etat Connexion");
                     alertErr.setHeaderText("Connexion non établie");
                     alertErr.setContentText("Veillez Vérifier Vos Champs et réssayer à nouveaux");
                     alertErr.showAndWait();
                    }
                     pst.close();
                     res.close();
          
            } catch (SQLException ex) {
               labelVerif.setText("SQL Error");
               System.err.println(ex);
               Logger.getLogger(authAdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
        
        
        
        
    }

    @FXML
    private void versInterfaceInscrit(ActionEvent event) throws IOException {
        
        Stage stage=null;
        Parent root=null;
        
          if (event.getSource()==btn_Inscrit){
                     
               //        Admin.id_admin_static=res.getInt("id_admin");
            
               //get reference to the button's stage
            stage=(Stage) btn_Inscrit.getScene().getWindow();
             //load up OTHER FXML document
            root=FXMLLoader.load(getClass().getResource("InscritUser.fxml"));
              }
              //create a new scene with root and set the stage// Creer un nouveau scène 
                 Scene scene=new Scene(root);
                 stage.setScene(scene);
                 stage.setTitle("Interface Inscription Utilisateur All For Deal");
                 stage.show();
    }

    @FXML
    private void ExitAuthAction(MouseEvent event) {
        System.exit(0);
    }
    
}

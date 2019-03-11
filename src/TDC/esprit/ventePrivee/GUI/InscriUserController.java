/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.GUI;


import TDC.esprit.ventePrivee.classes.UserDAO;
import TDC.esprit.ventePrivee.entities.User;
import TDC.esprit.ventePrivee.interfaces.IUserDAO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

/**
 *
 * @author Edzio
 */
public class InscriUserController implements Initializable{
    @FXML
    private TextField field_nom;
    @FXML
    private TextField field_prenom;
    @FXML
    private TextField field_Adresse;
    @FXML
    private TextField field_email;
    @FXML
    private TextField field_tel;
    @FXML
    private TextField field_login;
    private ToggleGroup sexe;
    @FXML
    private Button btnInscription;
    @FXML
    private ImageView ImgView_profile;
    @FXML
    private Button btn_browse;
    @FXML
    private TextField field_path_img;
    @FXML
    private Button btnRetourMenu;
    @FXML
    private ComboBox<String> field_statut;
    @FXML
    private PasswordField passwd;
    @FXML
    private ComboBox<String> sexe_user;
    
    private FileChooser fileChooser;
    private File file; 
    private Image image;
    private FileInputStream fis;

    @FXML
    private void Sinscrire(ActionEvent event) throws MalformedURLException {
        
        Alert alertOk,alertErr;
        alertOk=new Alert(Alert.AlertType.INFORMATION);
        alertErr=new Alert(Alert.AlertType.WARNING);

        try {
            fis=new FileInputStream(file);

            image=new Image(file.toURI().toURL().toString(),200,150,true,true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InscriUserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            BufferedImage bif=ImageIO.read(file);
        } catch (IOException ex) {
            Logger.getLogger(InscriUserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImgView_profile.setImage(image);
        
    int tel=Integer.parseInt(field_tel.getText());
    String Item=String.valueOf(field_statut.getSelectionModel().getSelectedItem());
    String itemSex=String.valueOf(sexe_user.getSelectionModel().getSelectedItem());
  

    User user = new User();

    user.setNomUser(field_nom.getText());
    user.setPrneomUser(field_prenom.getText());
    user.setAdressUser( field_Adresse.getText());
    user.setMailUser(field_email.getText());
    user.setTelUser(tel);
    user.setStatutUser(Item);
    user.setLoginUser(field_login.getText());
    user.setPwdUser(passwd.getText());
    user.setSexeUser(itemSex);
    user.setPhotoUser((InputStream)fis);
    //user.setImage((InputStream)fis);
    
    //UserDAO userDao=new UserDAO();
    IUserDAO userDao=new UserDAO();
    if(userDao.addUser(user)){
            alertOk.setTitle("Etat Inscription");
            alertOk.setHeaderText("Inscription Nouveau Utilisateur");
            alertOk.setContentText("Inscription de nouveaux utilisateur a été éffectué avec succés");
            alertOk.showAndWait();
            //Clear All Fields After Adding Successfuly
            ClearAllFields();
          
        }else if (!userDao.addUser(user)){
            //Dialogs.showWarningDialog(stage,"Ajout a été échoué","Information Dialog", "Etat Ajout Offre Produit");
            alertErr.setTitle("Etat Inscription");
            alertErr.setHeaderText("Inscription Nouveau Utilisateur");
            alertErr.setContentText("Inscription de nouveaux utilisateur a été échoué");
            alertErr.showAndWait();
           
        }    
    
    //code image:
    }
    
    public void ClearAllFields(){
        field_Adresse.clear();
        field_email.clear();
        field_login.clear();
        field_nom.clear();
        field_prenom.clear();
        field_tel.clear();
        passwd.clear();
    }

    @FXML
    private void browseImage(ActionEvent event) {
     
    
    }

    @FXML
    private void RetournerAcceuilUser(ActionEvent event) throws IOException {
         Stage stage=null;
        Parent root=null;
        
          if (event.getSource()==btnRetourMenu){
                     
               //        Admin.id_admin_static=res.getInt("id_admin");
            
               //get reference to the button's stage
            stage=(Stage) btnRetourMenu.getScene().getWindow();
             //load up OTHER FXML document
            root=FXMLLoader.load(getClass().getResource("authAdmin.fxml"));
              }
              //create a new scene with root and set the stage// Creer un nouveau scène 
                 Scene scene=new Scene(root);
                 stage.setScene(scene);
                 stage.setTitle("Interface Inscription Utilisateur All For Deal");
                 stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

     Stage primaryStage = null;
        
    
        fileChooser=new FileChooser();
        fileChooser.getExtensionFilters().addAll(
            new ExtensionFilter("Text Files","*txt"),
            new ExtensionFilter("Image Files","*.png","*.jpg","*.gif"),
            new ExtensionFilter("Audio Files","*wav","*.mp3","*.aac"),
            new ExtensionFilter("All Files","*.*")
        );
        
        btn_browse.setOnAction(e -> {
        file = fileChooser.showOpenDialog(primaryStage);
        // Single File Selection
        if (file!=null){
               // desktop.open(file); => c'était pour le test de "browse" files 
			   // TextField_Path ==> TextField eli yt7at fih chamin ta3 l foto , chouf f déclaration mte3k chnwa esmou mch kifkif ena w yek fl code
			   // imageView_Field ==> hia instance ta3 imageView , kifkif chouf selon ton code chnwa esmha 
			   
                field_path_img.setText(file.getAbsolutePath());
            try {
                image = new Image(file.toURI().toURL().toString(),200,150,true,true);//Path,prefWidth,prefHeight,preserveRatio,Smooth
                BufferedImage bufferedImage=ImageIO.read(file);
                ImgView_profile.setImage(image);
                
            } catch (MalformedURLException ex) {
                Logger.getLogger(InscriUserController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(InscriUserController.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            
                ImgView_profile = new ImageView(image);
                ImgView_profile.setFitWidth(200);
                ImgView_profile.setFitHeight(150);
                ImgView_profile.setVisible(true);
                ImgView_profile.setSmooth(true);
                ImgView_profile.setPreserveRatio(true);  
                
               
                BorderPane.setAlignment(ImgView_profile, Pos.TOP_LEFT);
         }
        });
    
    }
    
}

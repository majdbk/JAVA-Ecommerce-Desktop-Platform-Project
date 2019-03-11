/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.Poubelle.DechetsJava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

/**
 *
 * @author Edzio
 */
public class InscriUserController {
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
    @FXML
    private RadioButton sexe_Homme;
    @FXML
    private ToggleGroup sexe;
    @FXML
    private RadioButton sexe_Femme;
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
    private ComboBox<?> field_statut;

    @FXML
    private void Sinscrire(ActionEvent event) {
    }

    @FXML
    private void browseImage(ActionEvent event) {
    }

    @FXML
    private void RetournerAcceuilUser(ActionEvent event) {
    }
    
}

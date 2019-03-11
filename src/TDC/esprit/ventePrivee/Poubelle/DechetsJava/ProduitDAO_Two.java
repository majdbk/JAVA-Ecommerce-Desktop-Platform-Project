package TDC.esprit.ventePrivee.Poubelle.DechetsJava;

import TDC.esprit.ventePrivee.entities.Commentaire;
import TDC.esprit.ventePrivee.entities.Panier;
import TDC.esprit.ventePrivee.entities.Produit;
import TDC.esprit.ventePrivee.interfaces.IProduitDAO;
import TDC.esprit.ventePrivee.technique.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import sun.plugin2.jvm.RemoteJVMLauncher.CallBack;

/**
 *
 * @author Edzio
 */
public class ProduitDAO_Two  implements IProduitDAO {

    
    private Connection connection;
    
     //TABLE VIEW AND DATA
    private ObservableList<Produit> data;
    public TableView tableview=new TableView();


    public ProduitDAO_Two() {
        connection = DataBase.getInstance().getConnection();
    }
    
    
    @Override
    public boolean addProduitOffre(Produit produit) {
       
  String requete="insert into produit (prix_prd,libelle_prd,description_prd,nbPts_prd,dateAjout_prd,categorie_prd) values (?,?,?,?,?,?)";
       
   try {    
            PreparedStatement pst;
            pst = connection.prepareStatement(requete);
            
            pst.setDouble(1,produit.getPrix_prd());
            pst.setString(2,produit.getLibelle_prd());
            pst.setString(3,produit.getDespcription_prd());
            pst.setString(5,produit.getDateAjout_prd());
            pst.setString(6,produit.getCategorie_prd());
            
            pst.executeUpdate();
            System.out.println("Ajout du produit aux offres a ete éfféctué avec succés :) ");
            return true;
        } catch (SQLException ex) {
            System.err.println("Ajout du produit aux offres a été échoué :( "+ex.getMessage());
            return false;
        }
        
    }

    @Override
    public void updateProduit(Produit produit) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeProduitByLibelle(String libelle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeProduitById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produit> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public  ObservableList<String>  DisplayobservableArrayList() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produit findProduitByLibelle(String libelle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produit findProduitById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addProduitFavorie(Produit produit, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EvaluateProduit(Produit produit, Produit.Etoiles etoile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public void buyProduit(Produit produit, int id, double prix) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean CommenterProduit(Commentaire c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addProduitPanier(Panier panier) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
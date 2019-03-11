  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.classes;

import TDC.esprit.ventePrivee.entities.Commentaire;
import TDC.esprit.ventePrivee.entities.Panier;
import TDC.esprit.ventePrivee.entities.Produit;
import TDC.esprit.ventePrivee.interfaces.IProduitDAO;
import TDC.esprit.ventePrivee.technique.DataBase;
import java.io.FileInputStream;
import java.io.InputStream;
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
public class ProduitDAO  implements IProduitDAO {

    
   
    
     //TABLE VIEW AND DATA
    public ObservableList<ObservableList> data;
    public TableView tableview=new TableView();
    // File Input Stream
    private FileInputStream fis;

    private Connection connection;
    public ProduitDAO() {
        connection = DataBase.getInstance().getConnection();
    }
    
    
    @Override
    public boolean addProduitOffre(Produit produit) {
       
  String requete="insert into produit (prix_prd,libelle_prd,description_prd,dateAjout_prd,categorie_prd,Image,id_user) values (?,?,?,?,?,?,?)";
       
   try {    
            PreparedStatement pst;
            pst = connection.prepareStatement(requete);
            
            pst.setDouble(1,produit.getPrix_prd());
            pst.setString(2,produit.getLibelle_prd());
            pst.setString(3,produit.getDespcription_prd());
            pst.setString(4,produit.getDateAjout_prd());
            pst.setString(5,produit.getCategorie_prd());
            pst.setBinaryStream(6,produit.getImage());
            pst.setInt(7, produit.getIdUser());
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
       
    String requete="update produit set  prix_prd=? , libelle_prd=? ,description_prd=?,dateAjout_prd=?,categorie_prd=? where id_produit=? ";
  
        try {
            PreparedStatement pst=connection.prepareStatement(requete);
            
            pst.setDouble(1,produit.getPrix_prd());
            pst.setString(2,produit.getLibelle_prd());
            pst.setString(3,produit.getDespcription_prd());
            pst.setString(4,produit.getDateAjout_prd());
            pst.setObject(5,produit.getCategorie_prd());
            
            pst.setInt(6,produit.getId_Produit());
            
            pst.executeUpdate();
            pst.execute();
            System.out.println("Mise à jour du produit au niveau du compte personnelle a été éffectué  avec succés :) ");
            
        } catch (SQLException ex) {
            System.err.println("Mise à jour du produit au niveau du compte personnelle a été échoué :( "+ex.getMessage());
        }
        
    }

    @Override
    public boolean removeProduitByLibelle(String libelle) {
      
 String requete="delete from produit where libelle_prd=? ";
    
        try {
            PreparedStatement pst=connection.prepareStatement(requete);
            
            pst.setString(1,libelle);
            
            pst.executeUpdate();
            System.out.println("Suppression du produit du libelle :"+libelle+" a été éffectué avec succés :) ");
            return true;
        } catch (SQLException ex) {
            System.err.println("Suppression du produit du libelle :"+libelle+" a été éffectué avec échoué :( "+ex.getMessage());
            return true;
        }
    }

    @Override
    public boolean removeProduitById(int id) {
        
     String requete="delete from produit where id_produit=?";
     
        try {
            PreparedStatement pst=connection.prepareStatement(requete); 
            pst.setInt(1,id);     
            pst.executeUpdate();
            System.out.println("Suppression du produit numéro :"+id+" a été éffectué avec succés :) ");   
            return true; 
        } catch (SQLException ex) {
            System.err.println("Suppression du produit du numéro :"+id+" a été éffectué avec échoué :( "+ex.getMessage());
            return false;
        }
    }

    @Override
    public List<Produit> findAll() {
      
        List<Produit> listeProduits=new ArrayList<>();
        String requete="select * from produit";
        
        try {
            Statement stat=connection.createStatement();
            ResultSet res=stat.executeQuery(requete);
            
            while (res.next()){
                Produit produit=new Produit();
                
                produit.setId_Produit(res.getInt(1));
                produit.setPrix_prd(res.getDouble(2));
                produit.setLibelle_prd(res.getString(3));
                produit.setDespcription_prd(res.getString(4));
                
                produit.setDateAjout_prd(res.getString(5));
                produit.setCategorie_prd(res.getString(6));
                
                listeProduits.add(produit);
            }
            System.out.println("Affichage liste produits a été éffectué avec succés :) ");
            return listeProduits;
        } catch (SQLException ex) {
            System.err.println("Affichage liste produits a été échoué :(  "+ex.getMessage());
            return null;
        }
        
    }
  
    @Override
    public ObservableList<String> DisplayobservableArrayList() {
        
        ObservableList<String> row=FXCollections.observableArrayList();
        data=FXCollections.observableArrayList();
        
 try{
            // SQL for Selecting all Product
            String requete="select * from produit where valid_prd=1";
            ResultSet res=connection.createStatement().executeQuery(requete);
            /**********************************

             * TABLE COLUMN ADDED DYNAMICALLY *

             **********************************/
           
          for (int i=0;i<res.getMetaData().getColumnCount();i++){
                    //We are using non property style for making dynamic table
              final int j=i;
              TableColumn col=new TableColumn(res.getMetaData().getCatalogName(i+1));
               col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){    
                    @Override
                    public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {                                                                                             
                        return new SimpleStringProperty(param.getValue().get(j).toString());                       
                    }                   
                });
                tableview.getColumns().addAll(col);
                System.out.println("Column ["+res.getMetaData().getColumnCount()+"] ==> Added successfuly");
            }
          
          /********************************

             * Data added to ObservableList *

             ********************************/
          
     while (res.next()){
              // Iterate Row
          for (int i=0;i<res.getMetaData().getColumnCount();i++){
              // Iterate Column
              row.add(0,String.valueOf(res.getInt("id_produit")));
              row.add(1,String.valueOf(res.getDouble("prix_prd")));
              row.add(3,res.getString("libelle_prd"));
              row.add(4,res.getString("description_prd"));
              row.add(5,String.valueOf(res.getInt("nbPts_prd")));
              row.add(6,res.getString("dateAjout_prd"));
              row.add(7,res.getString("categorie_prd"));
              
              row.add(res.getString(i));
          }
           System.out.println("Row [1] Added"+row);
           data.add(row);       
    }
     // Finnaly Added to TableView
       tableview.setItems(data); 
       return row;
        
  }catch(Exception e){
    System.out.println("Error on building Data");
    return null;
 }
}
    
    
    @Override
    public Produit findProduitByLibelle(String libelle) {

        Produit produit=new Produit();
        String requete="select * from produit where libelle_prd=? ";
        
        try {
            PreparedStatement pst=connection.prepareStatement(requete);
            pst.setString(1,libelle);
            ResultSet res=pst.executeQuery();
            while (res.next()){
              
                produit.setId_Produit(res.getInt(1));
                
                produit.setPrix_prd(res.getDouble(2));
                produit.setLibelle_prd(res.getString(3));
                produit.setDespcription_prd(res.getString(4));
               
                produit.setDateAjout_prd(res.getString(5));
                produit.setCategorie_prd(res.getString(6));
            }
            System.out.println("Recherche du produit a été éffectué avec succés :) ");
            return produit;
        } catch (SQLException ex) {
         System.err.println("Recherche du produit a été éffectué avec échoué :( "+ex.getMessage()); 
         return null;
        }
        
    }

    @Override
    public Produit findProduitById(int id) {
   
        Produit produit=new Produit();
        String requete="select * from produit where id_produit=? ";
        
        try {
           PreparedStatement pst = connection.prepareStatement(requete);
           pst.setInt(1, id);
           ResultSet res=pst.executeQuery();
           
           while (res.next()){
                
                produit.setId_Produit(res.getInt(1));
                produit.setPrix_prd(res.getDouble(2));
                produit.setLibelle_prd(res.getString(3));
                produit.setDespcription_prd(res.getString(4));
               
                produit.setDateAjout_prd(res.getString(5));
                produit.setCategorie_prd(res.getString(6));
           }
            System.out.println("Recherche du produit a été éffectué avec succés :) ");
            return produit;
        }  
          
        catch (SQLException ex) {
           
            System.err.println("Recherche du produit a été éffectué avec échoué :( "+ex.getMessage()); 
            return null;
        }
       
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
        
        String requete="insert into commentaire (id_produit,commentaire) values (?,?)";
        try {    
            PreparedStatement pst;
            pst = connection.prepareStatement(requete);
            
            pst.setInt(1,c.getId_prd_com());
            pst.setString(2,c.getLibelle_prd_com());
            
            
            
            pst.executeUpdate();
            System.out.println("Ajout du produit aux offres a ete éfféctué avec succés :) ");
            return true;
        } catch (SQLException ex) {
            System.err.println("Ajout du produit aux offres a été échoué :( "+ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean addProduitPanier(Panier panier) {
        
        
        
        String requete="insert into panier (prix,libelle,id_produit,id_user) values (?,?,?,?)";
       
   try {    
            PreparedStatement pst;
            pst = connection.prepareStatement(requete);
            
            pst.setInt(1,panier.getPrix_prd_pnr());
            pst.setString(2,panier.getLibelle_prd_pnr());
            //pst.setInt(3,panier.getId_user_pnr());
            pst.setInt(3,panier.getId_prd_pnr());
            pst.setInt(4,panier.getId_user_pnr());
            
            
            pst.executeUpdate();
            System.out.println("Ajout du produit aux offres a ete éfféctué avec succés :) ");
            return true;
        } catch (SQLException ex) {
            System.err.println("Ajout du produit aux offres a été échoué :( "+ex.getMessage());
            return false;
        }
        
    }

      // méthode pour API jChart
    
     
    public int displayAll1() {
      
        int s1=0;
        String req="select * from produit where categorie_prd='telephonie'";
        
        
        Statement st;
        try {
        
         st = connection.createStatement();
         ResultSet rs = st.executeQuery(req);
         
          
           while(rs.next()){
              s1=s1+1;
     }
         
     } catch (SQLException ex) {
         Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
     }
        return s1;
    }
    
    public int displayAll2() {
      
        int s1=0;
        String req="select * from produit where categorie_prd='ordinateur'";
        
        
        Statement st;
        try {
        
         st = connection.createStatement();
         ResultSet rs = st.executeQuery(req);
         
          
           while(rs.next()){
              s1=s1+1;
     }
         
     } catch (SQLException ex) {
         Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
     }
        return s1;
    }
    public int displayAll3() {
      
        int s1=0;
        String req="select * from produit where categorie_prd='electromenager'";
        
        
        Statement st;
        try {
        
         st = connection.createStatement();
         ResultSet rs = st.executeQuery(req);
         
          
           while(rs.next()){
              s1=s1+1;
     }
         
     } catch (SQLException ex) {
         Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
     }
        return s1;
    }
    public int displayAll4() {
      
        int s1=0;
        String req="select * from produit where categorie_prd='Consoles_Videos'";
        
        
        Statement st;
        try {
        
         st = connection.createStatement();
         ResultSet rs = st.executeQuery(req);
         
          
           while(rs.next()){
              s1=s1+1;
     }
         
     } catch (SQLException ex) {
         Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
     }
        return s1;
    }
    public int displayAll5() {
      
        int s1=0;
        String req="select * from produit where categorie_prd='autres'";
        
        
        Statement st;
        try {
        
         st = connection.createStatement();
         ResultSet rs = st.executeQuery(req);
         
          
           while(rs.next()){
              s1=s1+1;
     }
         
     } catch (SQLException ex) {
         Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
     }
        return s1;
    }

    public int displayAll6() {
      
        int s1=0;
        String req="select * from produit where categorie_prd='vetements'";
        
        
        Statement st;
        try {
        
         st = connection.createStatement();
         ResultSet rs = st.executeQuery(req);
         
          
           while(rs.next()){
              s1=s1+1;
     }
         
     } catch (SQLException ex) {
         Logger.getLogger(ProduitDAO.class.getName()).log(Level.SEVERE, null, ex);
     }
        return s1;
    }
    

    
    
}

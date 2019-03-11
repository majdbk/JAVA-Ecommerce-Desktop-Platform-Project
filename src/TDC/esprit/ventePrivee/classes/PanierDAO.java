/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.classes;

import TDC.esprit.ventePrivee.dao.interfaces.IPanierDAO;
import TDC.esprit.ventePrivee.technique.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author majd ben khalifa
 */
public class PanierDAO implements IPanierDAO{
    
    private Connection connection;
    public PanierDAO() {
        connection = DataBase.getInstance().getConnection();
    }
    

    @Override
    public boolean removePanierById(int idProduit) {
         
          String requete="delete from panier where id_produit=?";
     
        try {
            PreparedStatement pst=connection.prepareStatement(requete); 
            pst.setInt(1,idProduit);     
            pst.executeUpdate();
            System.out.println("Suppression du produit numéro :"+idProduit+" a été éffectué avec succés :) ");   
            return true; 
        } catch (SQLException ex) {
            System.err.println("Suppression du produit du numéro :"+idProduit+" a été éffectué avec échoué :( "+ex.getMessage());
            return false;
        }
    
    }

    @Override
    public boolean removeAll() {
        String requete="delete from panier";
     
        try {
            PreparedStatement pst=connection.prepareStatement(requete); 
                 
            pst.executeUpdate();
            System.out.println("Suppression du produit numéro  a été éffectué avec succés :) ");   
            return true; 
        } catch (SQLException ex) {
            System.err.println("Suppression du produit du numéro a été éffectué avec échoué :( "+ex.getMessage());
            return false;
        }
    
        
    }
    
}

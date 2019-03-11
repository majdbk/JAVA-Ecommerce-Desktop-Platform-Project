/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.classes;

import TDC.esprit.ventePrivee.entities.Cadeaux;
import TDC.esprit.ventePrivee.interfaces.ICadeauxDAO;
import TDC.esprit.ventePrivee.technique.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gaston
 */
public class CadeauxDAO implements ICadeauxDAO{
        
    private Connection connection;
    
public CadeauxDAO(){
        connection=DataBase.getInstance().getConnection();
    }
   

    public boolean supprimer(int i) {
        
   String requete="delete from cadeaux where id_cadeau=?";
     
        try {
            PreparedStatement pst=connection.prepareStatement(requete); 
            pst.setInt(1,i);     
            pst.executeUpdate();
            System.out.println("Suppression du Cadeau numéro :"+i+" a été éffectué avec succés :) ");   
            return true; 
        } catch (SQLException ex) {
            System.err.println("Suppression du produit du numéro :"+i+" a été éffectué avec échoué :( "+ex.getMessage());
            return false;
        }
        
    }

    public void displayall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public boolean add(Cadeaux cad) {
       String requete="insert into cadeaux (nbr_pts_bonus_cad,descrp_cad,Image)values(?,?,?)";
       
        try {
            java.sql.PreparedStatement ps=connection.prepareStatement(requete);
            ps.setInt(1, cad.getPts_bonus_cad());
            ps.setString(2, cad.getDescription_cad());
            ps.setBinaryStream(3,cad.getImage());
            ps.executeUpdate();
            System.out.println("insertion effectué");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CadeauxDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean Modifier(Cadeaux cad) {
        String requete="update cadeaux set  nbr_pts_bonus_cad=?,descrp_cad=?  where id_cadeau=? ";
  
        try {
            PreparedStatement pst=connection.prepareStatement(requete);
            
            pst.setDouble(1,cad.getPts_bonus_cad());
            pst.setString(2,cad.getDescription_cad());
            pst.setInt(3,cad.getId_cad());
            
            pst.executeUpdate();
            pst.execute();
            System.out.println("Mise à jour du produit au niveau du compte personnelle a été éffectué  avec succés :) ");
            return true;
        } catch (SQLException ex) {
            System.err.println("Mise à jour du produit au niveau du compte personnelle a été échoué :( "+ex.getMessage());
            return false;
        }
        
        
        }
    }
    
   
        
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TDC.esprit.ventePrivee.classes;

import TDC.esprit.ventePrivee.interfaces.IServiceDao;
import TDC.esprit.ventePrivee.entities.Service;
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

/**
 *
 * @author Chedli
 */


public class ServiceDao_1 implements IServiceDao{
    
        public Connection connection;

     public ServiceDao_1() {
        connection = DataBase.getInstance().getConnection();
  }

    public void addService(Service service) {
        try {
            String req = "insert into service (description,duree,lieu,dateajout,noteevaluation,id_user_service) values (?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setString(1, service.getDescription());
            ps.setString(2, service.getDuree());
            ps.setString(3, service.getLieu());
            ps.setString(4, service.getDate_ajout());
            ps.setString(5, service.getNote_evaluation());
            ps.setInt(6,service.getIdUser());

            
            ps.executeUpdate();
            System.out.println("Service ajouter avec succes");

        } catch (SQLException ex) {
            Logger.getLogger(ServiceDao_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
      public boolean removeServiceById(int id) {
          String requete="delete from service where id=? ";
    
        try {
            PreparedStatement pst=connection.prepareStatement(requete);
            
            pst.setInt(1,id);
            
            pst.executeUpdate();
            System.out.println("Suppression du produit du libelle :"+id+" a été éffectué avec succés :) ");
            return true;
        } catch (SQLException ex) {
            System.err.println("Suppression du produit du libelle :"+id+" a été éffectué avec échoué :( "+ex.getMessage());
            return false;
            
        }
          
      }
      
    public List<Service> findAll() {
      
        List<Service> listeServices=new ArrayList<>();
        String requete="select * from service";
        
        try {
            Statement stat=connection.createStatement();
            ResultSet res=stat.executeQuery(requete);
            
            while (res.next()){
                Service service=new Service();
                
                service.setId(res.getInt(1));
                service.setDescription(res.getString(2));
                service.setDuree(res.getString(3));
                service.setLieu(res.getString(4));
                service.setDate_ajout(res.getString(5));
                service.setNote_evaluation(res.getString(6));
                
                listeServices.add(service);
            }
            System.out.println("Affichage liste services a été éffectué avec succés :) ");
            return listeServices;
        } catch (SQLException ex) {
            System.err.println("Affichage liste services a été échoué :(  "+ex.getMessage());
            return null;
        }
        
    }
    public void updateService(Service service) {
       
    String requete="update service set  description=? , duree=? ,lieu=?, dateajout=? ,noteevaluation=? where id=? ";
  
        try {
            PreparedStatement pst=connection.prepareStatement(requete);
            
            pst.setString(1,service.getDescription());
            pst.setString(2,service.getDuree());
            pst.setString(3,service.getLieu());
            pst.setString(4,service.getDate_ajout());
            pst.setString(5,service.getNote_evaluation());
            
            pst.setInt(6,service.getId());
            
            pst.executeUpdate();
            pst.execute();
            System.out.println("Mise à jour du produit au niveau du compte personnelle a été éffectué  avec succés :) ");
            
        } catch (SQLException ex) {
            System.err.println("Mise à jour du produit au niveau du compte personnelle a été échoué :( "+ex.getMessage());
        }
        
    }
}
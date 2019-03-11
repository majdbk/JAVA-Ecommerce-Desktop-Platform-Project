/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.classes;

import TDC.esprit.ventePrivee.entities.Admin;
import TDC.esprit.ventePrivee.interfaces.IAdminDAO;
import TDC.esprit.ventePrivee.technique.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Edzio
 */
public class AdminDAO implements IAdminDAO {

       private Connection connection;
       public AdminDAO() {
        connection = DataBase.getInstance().getConnection();
       }
    
    
    @Override
    public void updateProfileAdmin(Admin admin) {
        String requete="update admin set  nom_admin=? , prnm_admin=? ,age_admin=?,sexe_admin=?,email_admin=?,login_admin=?,pwd_admin=? where id_admin=? ";
  
        try {
            PreparedStatement pst=connection.prepareStatement(requete);
            
            pst.setString(1,admin.getNom_Admin());
            pst.setString(2,admin.getPrnm_Admin());
            pst.setInt(3,admin.getAge_Admin());
            pst.setString(4,admin.getSex_Admin());
            pst.setString(5,admin.getEmail_Admin());
            pst.setString(6,admin.getLogin_Admin());
            pst.setString(7,admin.getPwd_Admin());
            
            pst.setInt(8,admin.getId_Admin());
            
            pst.executeUpdate();
            pst.execute();
            System.out.println("Mise à jour du produit au niveau du compte personnelle a été éffectué  avec succés :) ");
            
        } catch (SQLException ex) {
            System.err.println("Mise à jour du produit au niveau du compte personnelle a été échoué :( "+ex.getMessage());
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.classes;

import TDC.esprit.ventePrivee.dao.interfaces.IcategorieDAO;
import TDC.esprit.ventePrivee.entities.Categorie;
import TDC.esprit.ventePrivee.technique.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author majd ben khalifa
 */
public class CategorieDAO implements IcategorieDAO {
    
    public Connection connection;
    public CategorieDAO() {
        connection = DataBase.getInstance().getConnection();
    }

    @Override
    public boolean addCategorie(Categorie categorie) {
        
        try {
            String req="insert into categorie(libelle,description,type_categorie) values (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setString(1, categorie.getLibelle());
            ps.setString(2, categorie.getDescription());
            ps.setString(3, categorie.getType_categorie());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
            
        
    }

    @Override
    public boolean removeCategorieByID(int id_categorie) {
        
        try {
            String req="delete from categorie where id_categorie=?";
            PreparedStatement ps = connection.prepareStatement(req);
            ps.setInt(1, id_categorie);
            ps.executeUpdate();
            System.out.println("categorie supprime avec succes");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CategorieDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
        
        
      
    }

    @Override
    public void updateCategorie(Categorie categorie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categorie> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categorie findCategorieByID(int id_categorie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

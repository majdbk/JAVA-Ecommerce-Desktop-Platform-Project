/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.classes;

import TDC.esprit.ventePrivee.entities.User;
import TDC.esprit.ventePrivee.interfaces.IUserDAO;
import TDC.esprit.ventePrivee.technique.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Edzio
 */
public class UserDAO implements IUserDAO {
    
    private Connection connection;
    public UserDAO() {
        connection = DataBase.getInstance().getConnection();
    }
    

@Override
 public boolean addUser(User user) {

  String requete="insert into utilisateur (nom_user,prenom_user,adresse_user,email_user,tel_user,statut_user,login_user,pwd_user,sexe_user,photo_user) values (?,?,?,?,?,?,?,?,?,?)";
  
  try {
  PreparedStatement pst;
  pst = connection.prepareStatement(requete);
  
  pst.setString(1,user.getNomUser());
  pst.setString(2,user.getPrneomUser());
  pst.setString(3,user.getAdressUser());
  pst.setString(4,user.getMailUser());
  pst.setInt(5,user.getTelUser());
  pst.setString(6,user.getStatutUser());
  pst.setString(7,user.getLoginUser());
  pst.setString(8,user.getPwdUser());
  pst.setString(9,user.getSexeUser());
  pst.setBinaryStream(10,user.getPhotoUser());
  pst.executeUpdate();
  System.out.println("Inscription effectuée"); 
  return true;
    } catch (SQLException ex) {
  System.err.println("Inscription a été échoué :( "+ex.getMessage());
  return false;
  }
}
}



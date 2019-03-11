
package TDC.esprit.ventePrivee.classes;


import TDC.esprit.ventePrivee.technique.DataBase;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import TDC.esprit.ventePrivee.entities.demandeService;


public class serviceDao {
     public Connection connection;

    public serviceDao() throws IOException {
        connection = DataBase.getInstance().getConnection();
    }

    /**
     *
     * @param demande
     * @param ins
     */
   
    public void ajouter (demandeService demande)  {
        
                    String req = "insert into demande_service (objet,description,cathegorie,lieu,date,id_user_demande) values (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = connection.prepareStatement(req);
          
            ps.setString(1,demande.getObjet());
            ps.setString(2,demande.getDescription());
            ps.setString(3,demande.getCathegorie());
             ps.setString(4,demande.getLieu());       
            ps.setString(5,demande.getDate());
           ps.setInt(6,demande.getIdUserDemServ());
           
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(serviceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    
        public boolean removeServiceById(int id_) {
        
     String requete="delete from demande_service where id=?";
     
        try {
            PreparedStatement pst=connection.prepareStatement(requete); 
            pst.setInt(1,id_);     
            pst.executeUpdate();
            System.out.println("Suppression du produit numéro :"+id_+" a été éffectué avec succés :) ");   
            return true; 
        } catch (SQLException ex) {
            System.err.println("Suppression du produit du numéro :"+id_+" a été éffectué avec échoué :( "+ex.getMessage());
            return false;
        }
    } 
           public void updateService(demandeService service) {
       
    String requete="update demande_service set  objet=? , description=? , cathegorie=? , lieu=? , date=? where id=? ";
  
        try {
            PreparedStatement pst=connection.prepareStatement(requete);
            
            pst.setString(1,service.getObjet());
            pst.setString(2,service.getDescription());
            pst.setString(3,service.getCathegorie());
            pst.setString(4,service.getLieu());
            pst.setString(5,service.getDate());
            
            pst.setInt(6,service.getId());
            System.out.println(pst);
            pst.executeUpdate();
            System.out.println("Mise à jour du produit au niveau du compte personnelle a été éffectué  avec succés :) ");
            
        } catch (SQLException ex) {
            System.err.println("Mise à jour du produit au niveau du compte personnelle a été échoué :( "+ex.getMessage());
        }
        
    }
}
    


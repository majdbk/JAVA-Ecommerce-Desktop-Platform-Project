/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.dao.interfaces;

import TDC.esprit.ventePrivee.entities.Categorie;
import java.util.List;

/**
 *
 * @author majd ben khalifa
 */
public interface IcategorieDAO {
    boolean addCategorie (Categorie categorie);
    
    boolean removeCategorieByID (int id_categorie);
    
    void updateCategorie(Categorie categorie);
    
    List<Categorie> findAll ();
    
    Categorie findCategorieByID (int id_categorie);
      
    
}

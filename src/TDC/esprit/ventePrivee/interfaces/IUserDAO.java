/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.interfaces;

import TDC.esprit.ventePrivee.entities.User;

/**
 *
 * @author Edzio
 */
public interface IUserDAO {
    
    // Inscription Utilisateur 
    boolean addUser(User user);
}

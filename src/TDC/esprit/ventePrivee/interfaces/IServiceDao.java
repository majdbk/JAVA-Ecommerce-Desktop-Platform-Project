/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TDC.esprit.ventePrivee.interfaces;

import TDC.esprit.ventePrivee.entities.Service;

/**
 *
 * @author Chedli
 */
public interface IServiceDao {
     
        void addService(Service service);
        boolean removeServiceById(int id) ;
        void updateService(Service service);

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.entities;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TextField;
import javax.activation.DataSource;

/**
 *
 * @author Gaston
 */
public class Cadeaux {

    private int id_cad;
    private int pts_bonus_cad;
    private String description_cad;
    private InputStream Image;

    public InputStream getImage() {
        return Image;
    }

    public void setImage(InputStream Image) {
        this.Image = Image;
    }
    
    
    public Cadeaux(){
            }

    public Cadeaux(int id_cad, int pts_bonus_cad, String description_cad, InputStream Image) {
        this.id_cad = id_cad;
        this.pts_bonus_cad = pts_bonus_cad;
        this.description_cad = description_cad;
        this.Image = Image;
    }

    public Cadeaux(int id_cad, int pts_bonus_cad, String description_cad) {
        this.id_cad = id_cad;
        this.pts_bonus_cad = pts_bonus_cad;
        this.description_cad = description_cad;
    }
    
   
    

    public int getId_cad() {
        return id_cad;
    }

    public int getPts_bonus_cad() {
        return pts_bonus_cad;
    }

    public void setId_cad(int id_cad) {
        this.id_cad = id_cad;
    }

        
    public void setPts_bonus_cad(int pts_bonus_cad) {
        this.pts_bonus_cad = pts_bonus_cad;
    }

    public String getDescription_cad() {
        return description_cad;
    }

    public void setDescription_cad(String description_cad) {
        this.description_cad = description_cad;
    }

    

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.id_cad;
        hash = 19 * hash + this.pts_bonus_cad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cadeaux other = (Cadeaux) obj;
        if (this.id_cad != other.id_cad) {
            return false;
        }
        if (this.pts_bonus_cad != other.pts_bonus_cad) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cadeaux{" + "id_cad=" + id_cad + ", pts_bonus_cad=" + pts_bonus_cad + ", description_cad=" + description_cad + '}';
    }

    public void setPts_bonus_cad(TextField P_Bonus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    

    
    
    }

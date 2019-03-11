/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.entities;

import java.util.Objects;

/**
 *
 * @author majd ben khalifa
 */
public class Commentaire {
    
    private int id_commentaire;
    private int id_prd_com;
    private String libelle_prd_com;
    
    public Commentaire() {
        
    }

    public Commentaire(int id_commentaire, int id_prd_com, String libelle_prd_com) {
        this.id_commentaire = id_commentaire;
        this.id_prd_com = id_prd_com;
        this.libelle_prd_com = libelle_prd_com;
    }

    public Commentaire(String libelle_prd_com) {
        this.libelle_prd_com = libelle_prd_com;
    }

  

    
    public int getId_commentaire() {
        return id_commentaire;
    }

    public void setId_commentaire(int id_commentaire) {
        this.id_commentaire = id_commentaire;
    }

    public int getId_prd_com() {
        return id_prd_com;
    }

    public void setId_prd_com(int id_prd_com) {
        this.id_prd_com = id_prd_com;
    }

    public String getLibelle_prd_com() {
        return libelle_prd_com;
    }

    public void setLibelle_prd_com(String libelle_prd_com) {
        this.libelle_prd_com = libelle_prd_com;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id_commentaire;
        hash = 83 * hash + this.id_prd_com;
        hash = 83 * hash + Objects.hashCode(this.libelle_prd_com);
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
        final Commentaire other = (Commentaire) obj;
        if (this.id_commentaire != other.id_commentaire) {
            return false;
        }
        if (this.id_prd_com != other.id_prd_com) {
            return false;
        }
        if (!Objects.equals(this.libelle_prd_com, other.libelle_prd_com)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Commentaire{" + "id_commentaire=" + id_commentaire + ", id_prd_com=" + id_prd_com + ", libelle_prd_com=" + libelle_prd_com + '}';
    }
    
    
    
}

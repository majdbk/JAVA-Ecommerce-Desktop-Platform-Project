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
public class Categorie {
    private int id_categorie;
    private String libelle;
    private String description;
    private String type_categorie;
    
    public Categorie () {
        
    }
    public Categorie(int id_categorie, String libelle, String description, String type_categorie) {
        this.id_categorie = id_categorie;
        this.libelle = libelle;
        this.description = description;
        this.type_categorie = type_categorie;
    }

    public int getId_categorie() {
        return id_categorie;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getDescription() {
        return description;
    }

    public String getType_categorie() {
        return type_categorie;
    }

    public void setId_categorie(int id_categorie) {
        this.id_categorie = id_categorie;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType_categorie(String type_categorie) {
        this.type_categorie = type_categorie;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id_categorie;
        hash = 37 * hash + Objects.hashCode(this.libelle);
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
        final Categorie other = (Categorie) obj;
        if (this.id_categorie != other.id_categorie) {
            return false;
        }
        if (!Objects.equals(this.libelle, other.libelle)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categorie{" + "id_categorie=" + id_categorie + ", libelle=" + libelle + ", description=" + description + ", type_categorie=" + type_categorie + '}';
    }
    
   
}

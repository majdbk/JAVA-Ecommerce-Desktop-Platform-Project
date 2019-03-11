/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.entities;

/**
 *
 * @author majd ben khalifa
 */
public class Panier {
    private int id_pnr;
    private int prix_prd_pnr;
    private String libelle_prd_pnr;
    private int id_user_pnr;
    private int id_prd_pnr;
    
      
    public Panier () {
        
    }

    public Panier(int id_pnr, int prix_prd_pnr, String libelle_prd_pnr, int id_user_pnr, int id_prd_pnr) {
        this.id_pnr = id_pnr;
        this.prix_prd_pnr = prix_prd_pnr;
        this.libelle_prd_pnr = libelle_prd_pnr;
        this.id_user_pnr = id_user_pnr;
        this.id_prd_pnr = id_prd_pnr;
    }

    public Panier(int id_prd_pnr, String libelle_prd_pnr ,int prix_prd_pnr) {
        
        this.id_prd_pnr = id_prd_pnr;
        this.libelle_prd_pnr = libelle_prd_pnr;
        this.prix_prd_pnr = prix_prd_pnr;
        
    }
    
   
    public int getId_pnr() {
        return id_pnr;
    }

    public int getPrix_prd_pnr() {
        return prix_prd_pnr;
    }

    public String getLibelle_prd_pnr() {
        return libelle_prd_pnr;
    }

    public int getId_user_pnr() {
        return id_user_pnr;
    }

    public int getId_prd_pnr() {
        return id_prd_pnr;
    }

   

    public void setId_pnr(int id_pnr) {
        this.id_pnr = id_pnr;
    }

    public void setPrix_prd_pnr(int prix_prd_pnr) {
        this.prix_prd_pnr = prix_prd_pnr;
    }

    public void setLibelle_prd_pnr(String libelle_prd_pnr) {
        this.libelle_prd_pnr = libelle_prd_pnr;
    }

    public void setId_user_pnr(int id_user_pnr) {
        this.id_user_pnr = id_user_pnr;
    }

    public void setId_prd_pnr(int id_prd_pnr) {
        this.id_prd_pnr = id_prd_pnr;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id_pnr;
        hash = 23 * hash + this.prix_prd_pnr;
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
        final Panier other = (Panier) obj;
        if (this.id_pnr != other.id_pnr) {
            return false;
        }
        if (this.prix_prd_pnr != other.prix_prd_pnr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Panier{" + "id_pnr=" + id_pnr + ", prix_prd_pnr=" + prix_prd_pnr + ", libelle_prd_pnr=" + libelle_prd_pnr + ", id_user_pnr=" + id_user_pnr + ", id_prd_pnr=" + id_prd_pnr + '}';
    }
    
}

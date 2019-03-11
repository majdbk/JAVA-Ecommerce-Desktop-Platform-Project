/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.entities;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.Date;
import java.util.Objects;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

/**
 *
 * @author Edzio
 */
public class Produit {
    
    
    private int Id_Produit;
    private double prix_prd;
    private String libelle_prd;
    private String despcription_prd;
   // private int nbPts_prd;
  //  private String noteEvaluation_prd;
    private String dateAjout_prd;
    //private TypesProduits categorie_prd;
    private String categorie_prd;
    //private String commentaire_prd;
    private InputStream Image; //
    private int validite;
    private int idUser;
    
    public enum TypesProduits{Télèphonie,Ordinateur,Laptop,Consoles_Videos,Jeux_Videos,Caméscopes,Vetements,Bricolage,Elèctroménager,autres};                                       
   // public enum TypesProduits{};                                       

    public enum Etoiles{UnEtoiles,DeuxEtoiles,TroisEtoiles,QuatresEtoiles,CinquesEtoiles};
  
    /*  public final class TypesProduits{
      public static final  String Tel="Télèphonie";
      public static final  String ord="Ordinateur";
      public static final  String Pc="Laptop";
      public static final  String Cons="Consoles_Videos";
      public static final  String Games="Jeux_Videos";
      public static final  String cam="Caméscopes";
      public static final  String Vet="Vetements";
      public static final  String Bri="Bricolage";
      public static final  String Elec="Elèctroménager";
      public static final  String Autr="autres";

        
    }*/
  

    /* public Produit(int Id_Produit, double prix_prd, String libelle_prd, String despcription_prd, int nbPts_prd, String noteEvaluation_prd, String dateAjout_prd, String categorie_prd, String commentaire_prd) {
    this.Id_Produit = Id_Produit;
    this.prix_prd = prix_prd;
    this.libelle_prd = libelle_prd;
    this.despcription_prd = despcription_prd;
    this.nbPts_prd = nbPts_prd;
    this.noteEvaluation_prd = noteEvaluation_prd;
    this.dateAjout_prd = dateAjout_prd;
    this.categorie_prd = categorie_prd;
    this.commentaire_prd = commentaire_prd;
    }
    
    public Produit(double prix_prd, String libelle_prd, String despcription_prd, int nbPts_prd, String dateAjout_prd, String categorie_prd) {
    this.prix_prd = prix_prd;
    this.libelle_prd = libelle_prd;
    this.despcription_prd = despcription_prd;
    this.nbPts_prd = nbPts_prd;
    this.dateAjout_prd = dateAjout_prd;
    this.categorie_prd = categorie_prd;
    }
    
    public Produit(int Id_Produit, double prix_prd, String libelle_prd, String despcription_prd, int nbPts_prd, String dateAjout_prd, String categorie_prd) {
    this.Id_Produit = Id_Produit;
    this.prix_prd = prix_prd;
    this.libelle_prd = libelle_prd;
    this.despcription_prd = despcription_prd;
    this.nbPts_prd = nbPts_prd;
    this.dateAjout_prd = dateAjout_prd;
    this.categorie_prd = categorie_prd;
    }
    //
    public Produit(int Id_Produit, double prix_prd, String libelle_prd, String despcription_prd, int nbPts_prd, String dateAjout_prd, String categorie_prd, InputStream Image) {
    this.Id_Produit = Id_Produit;
    this.prix_prd = prix_prd;
    this.libelle_prd = libelle_prd;
    this.despcription_prd = despcription_prd;
    this.nbPts_prd = nbPts_prd;
    this.dateAjout_prd = dateAjout_prd;
    this.categorie_prd = categorie_prd;
    this.Image = Image;
    }*/
    
    public Produit(){
        
    }

    public Produit(int Id_Produit, double prix_prd, String libelle_prd, String despcription_prd, String dateAjout_prd, String categorie_prd, InputStream Image) {
        this.Id_Produit = Id_Produit;
        this.prix_prd = prix_prd;
        this.libelle_prd = libelle_prd;
        this.despcription_prd = despcription_prd;
        this.dateAjout_prd = dateAjout_prd;
        this.categorie_prd = categorie_prd;
        this.Image = Image;
    }

    public Produit(double prix_prd, String libelle_prd, String despcription_prd, String dateAjout_prd, String categorie_prd, InputStream Image) {
        this.prix_prd = prix_prd;
        this.libelle_prd = libelle_prd;
        this.despcription_prd = despcription_prd;
        this.dateAjout_prd = dateAjout_prd;
        this.categorie_prd = categorie_prd;
        this.Image = Image;
    }

    public Produit(int Id_Produit, double prix_prd, String libelle_prd, String despcription_prd, String dateAjout_prd, String categorie_prd) {
        this.Id_Produit = Id_Produit;
        this.prix_prd = prix_prd;
        this.libelle_prd = libelle_prd;
        this.despcription_prd = despcription_prd;
        this.dateAjout_prd = dateAjout_prd;
        this.categorie_prd = categorie_prd;
    }

 
  //

    public Produit(int Id_Produit, double prix_prd, String libelle_prd, String despcription_prd, String dateAjout_prd, String categorie_prd, int idUser) {
        this.Id_Produit = Id_Produit;
        this.prix_prd = prix_prd;
        this.libelle_prd = libelle_prd;
        this.despcription_prd = despcription_prd;
        this.dateAjout_prd = dateAjout_prd;
        this.categorie_prd = categorie_prd;
        this.idUser = idUser;
    }

    public Produit(int Id_Produit, double prix_prd, String libelle_prd, String despcription_prd, String dateAjout_prd, String categorie_prd, int validite, int idUser) {
        this.Id_Produit = Id_Produit;
        this.prix_prd = prix_prd;
        this.libelle_prd = libelle_prd;
        this.despcription_prd = despcription_prd;
        this.dateAjout_prd = dateAjout_prd;
        this.categorie_prd = categorie_prd;
        this.validite = validite;
        this.idUser = idUser;
    }

   
    
    
    
   
    
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public InputStream getImage() {
        return Image;
    }

    public void setImage(InputStream Image) {
        this.Image = Image;
    }

   //

    public int getValidite() {
        return validite;
    }

    public void setValidite(int validite) {
        this.validite = validite;
    }
    
    
    public int getId_Produit() {
        return Id_Produit;
    }

    public void setId_Produit(int Id_Produit) {
        this.Id_Produit = Id_Produit;
    }

    public double getPrix_prd() {
        return prix_prd;
    }

    public void setPrix_prd(double prix_prd) {
        this.prix_prd = prix_prd;
    }

    public String getLibelle_prd() {
        return libelle_prd;
    }

    public void setLibelle_prd(String libelle_prd) {
        this.libelle_prd = libelle_prd;
    }

    public String getDespcription_prd() {
        return despcription_prd;
    }

    public void setDespcription_prd(String despcription_prd) {
        this.despcription_prd = despcription_prd;
    }



    public String getDateAjout_prd() {
        return dateAjout_prd;
    }

    public void setDateAjout_prd(String dateAjout_prd) {
        this.dateAjout_prd = dateAjout_prd;
    }

    public String getCategorie_prd() {
        return categorie_prd;
    }

    public void setCategorie_prd(String categorie_prd) {
        this.categorie_prd = categorie_prd;
    }

   

    
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.Id_Produit+(int)(Double.doubleToLongBits(this.prix_prd))*30+this.libelle_prd.length();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
  
         if(!(obj instanceof Produit)){
            return false;
        }
        
        Produit other = (Produit) obj;
        
        if (this.Id_Produit == other.Id_Produit && Double.doubleToLongBits(this.prix_prd) == Double.doubleToLongBits(other.prix_prd) && this.libelle_prd.equals(other.getLibelle_prd())) {
            return true;
        }else{
            return false;
        }
       
    }

    @Override
    public String toString() {
        return "Produit{" + "Id_Produit=" + Id_Produit + ", prix_prd=" + prix_prd + ", libelle_prd=" + libelle_prd + ", despcription_prd=" + despcription_prd + ", dateAjout_prd=" + dateAjout_prd + ", categorie_prd=" + categorie_prd + ", Image=" + Image + '}';
    }

   
    
    
    
}

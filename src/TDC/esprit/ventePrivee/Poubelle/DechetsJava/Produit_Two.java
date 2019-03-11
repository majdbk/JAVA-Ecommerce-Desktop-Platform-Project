/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.Poubelle.DechetsJava;

import java.sql.Date;
import java.util.Objects;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
 
/**
 *
 * @author Edzio
 */
public class Produit_Two {
    
    
    private StringProperty Id_Produit;
    //private StringProperty prix_prd;
    private String prix_prd;
    private StringProperty libelle_prd;
    private StringProperty despcription_prd;
    private StringProperty nbPts_prd;
    private Etoiles noteEvaluation_prd;
    private StringProperty dateAjout_prd;
    //private TypesProduits categorie_prd;
    private StringProperty categorie_prd;
    private String commentaire_prd;
   
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
    public Produit_Two(){
        
    }

    public Produit_Two(String Id_Produit,String prix_prd, String libelle_prd, String despcription_prd, String nbPts_prd, String dateAjout_prd, String categorie_prd) {
        this.Id_Produit= new SimpleStringProperty(Id_Produit);
      //  this.prix_prd = new SimpleStringProperty(prix_prd);
        this.libelle_prd = new SimpleStringProperty(libelle_prd);
        this.despcription_prd = new SimpleStringProperty(despcription_prd);
        this.nbPts_prd = new SimpleStringProperty(nbPts_prd);
        this.dateAjout_prd = new SimpleStringProperty(dateAjout_prd);
        this.categorie_prd = new SimpleStringProperty(categorie_prd);
    }

    public Produit_Two(String prix_prd) {
        this.prix_prd = prix_prd;
    }
    

    public StringProperty Id_ProduitProperty() {
        return Id_Produit;
    }
    
    

    public void setId_Produit(StringProperty Id_Produit) {
        this.Id_Produit = Id_Produit;
    }

    //
    public String Prix_prdProperty() {
        return prix_prd;
    }
    
    public void setPrix_prd(String prix_prd) {
        this.prix_prd = prix_prd;
    }
    
    public String getPrix_prd(){
        return prix_prd;
    }  
    
    //
    
    public StringProperty Libelle_prdProperty() {
        return libelle_prd;
    }

    public void setLibelle_prd(StringProperty libelle_prd) {
        this.libelle_prd = libelle_prd;
    }

    public StringProperty Despcription_prdProperty() {
        return despcription_prd;
    }

    public void setDespcription_prd(StringProperty despcription_prd) {
        this.despcription_prd = despcription_prd;
    }

    public StringProperty NbPts_prdProperty() {
        return nbPts_prd;
    }

    public void setNbPts_prd(StringProperty nbPts_prd) {
        this.nbPts_prd = nbPts_prd;
    }

    public StringProperty DateAjout_prdProperty() {
        return dateAjout_prd;
    }

    public void setDateAjout_prd(StringProperty dateAjout_prd) {
        this.dateAjout_prd = dateAjout_prd;
    }

    public StringProperty Categorie_prdProperty() {
        return categorie_prd;
    }

    public void setCategorie_prd(StringProperty categorie_prd) {
        this.categorie_prd = categorie_prd;
    }



    
    
    
    
}

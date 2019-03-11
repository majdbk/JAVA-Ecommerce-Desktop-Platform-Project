/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.interfaces;

import TDC.esprit.ventePrivee.entities.Commentaire;
import TDC.esprit.ventePrivee.entities.Panier;
import TDC.esprit.ventePrivee.entities.Produit;
import java.util.List;
import static javafx.collections.FXCollections.observableList;
import javafx.collections.ObservableList;

/**
 *
 * @author Edzio
 */
public interface IProduitDAO {
    
    
    // Ajouter Produit au offres (au niveau compte personnelle)
    boolean addProduitOffre(Produit produit);
    
    // Modifier Produit  (au niveau du compte personnelle)
    void updateProduit(Produit produit);

    // Supprimer Produit (au niveau compte personlle)
    boolean removeProduitByLibelle(String libelle);
    boolean removeProduitById(int id);
    
    // Afficher Liste Produits  
    List<Produit> findAll();
    // Affichage avec TableView
    ObservableList<String> DisplayobservableArrayList();
    // 
    // Rechercher Produit
    Produit findProduitByLibelle(String libelle);
    Produit findProduitById(int id);
    
    // Ajouter Produit au catégorie Favorite (Mise à Jour : Update)
    void addProduitFavorie(Produit produit,int id);
    
    // Evaluer Produit (Mise à jour : Update)
    void EvaluateProduit(Produit produit,Produit.Etoiles etoile);
    
      // Commenter Produit (Mise à jour : Update)
    boolean CommenterProduit(Commentaire c);
    
    // Réclamer Produit 
    //void ReclamerProduit(Produit produit);
    
    // Proposer Produit
    //void ProposerProduit(Produit produit,int id);
    
    // Ajouter produit au panier pour l'acheter
    public boolean addProduitPanier(Panier panier);
    
    // Acheter produit depuis la panier
    public void buyProduit(Produit produit,int id,double prix);
    
      
}

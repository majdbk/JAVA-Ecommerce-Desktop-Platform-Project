
package TDC.esprit.ventePrivee.entities;

import java.util.Objects;

/**
 *
 * @author eib
 */
public class demandeService {
     private int  id ;
    private String objet ;
     private String description ;
      private String cathegorie ;
       private String lieu ;
        private String date ;
        private int valid_serv_dem;
        private int idUserDemServ;
        
        public demandeService()
        {
        }

    public demandeService(int id, String objet, String description, String cathegorie, String lieu, String date, int idUserDemServ) {
        this.id = id;
        this.objet = objet;
        this.description = description;
        this.cathegorie = cathegorie;
        this.lieu = lieu;
        this.date = date;
        this.idUserDemServ = idUserDemServ;
    }

        
    public demandeService(int id, String objet, String description, String cathegorie, String lieu, String date, int valid_serv_dem, int idUserDemServ) {
        this.id = id;
        this.objet = objet;
        this.description = description;
        this.cathegorie = cathegorie;
        this.lieu = lieu;
        this.date = date;
        this.valid_serv_dem = valid_serv_dem;
        this.idUserDemServ = idUserDemServ;
    }

        
        
    /*  public demandeService(int id, String objet, String description, String cathegorie, String lieu, String date, int valid_serv_dem) {
    this.id = id;
    this.objet = objet;
    this.description = description;
    this.cathegorie = cathegorie;
    this.lieu = lieu;
    this.date = date;
    this.valid_serv_dem=valid_serv_dem;
    }*/

    public demandeService(int id, String objet, String description, String cathegorie, String lieu, String date) {
        this.id = id;
        this.objet = objet;
        this.description = description;
        this.cathegorie = cathegorie;
        this.lieu = lieu;
        this.date = date;
    }

    public int getIdUserDemServ() {
        return idUserDemServ;
    }

    public void setIdUserDemServ(int idUserDemServ) {
        this.idUserDemServ = idUserDemServ;
    }
    
  
   
    
    
    

    public int getId() {
        return id;
    }

    public String getObjet() {
        return objet;
    }

    public String getDescription() {
        return description;
    }

    public String getCathegorie() {
        return cathegorie;
    }

    public String getLieu() {
        return lieu;
    }

    public String getDate() {
        return date;
    }

    public int getValid_serv_dem() {
        return valid_serv_dem;
    }

    public void setValid_serv_dem(int valid_serv_dem) {
        this.valid_serv_dem = valid_serv_dem;
    }

   

    
    
   

    public void setId(int id) {
        this.id = id;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCathegorie(String cathegorie) {
        this.cathegorie = cathegorie;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "demandeService{" + "id=" + id + ", objet=" + objet + ", description=" + description + ", cathegorie=" + cathegorie + ", lieu=" + lieu + ", date=" + date + ", valid_serv_dem=" + valid_serv_dem + '}';
    }
     

   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.objet);
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
        final demandeService other = (demandeService) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.objet, other.objet)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
        
        
        
    
    
}


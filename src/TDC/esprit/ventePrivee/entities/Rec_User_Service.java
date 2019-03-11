/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.entities;

/**
 *
 * @author Edzio
 */
public class Rec_User_Service {
   
    // att user reclamant sur service
    private int idUser;
    private String nomUser;
    private String prneomUser;
    private String mailUser;
    // att service recalmé
    private int id_Serv;
    private String catgorie_Serv;
    // att du réclamation
    private int id_rec;
    private String desc_rec;
    private String date_rec;
    private String raisonRec;
    private int nbre_rec;
    
    public Rec_User_Service(){
        
    }

    public Rec_User_Service(int idUser, String nomUser, String prneomUser, String mailUser, int id_Serv, String catgorie_Serv, int id_rec, String desc_rec, String date_rec, String raisonRec, int nbre_rec) {
        this.idUser = idUser;
        this.nomUser = nomUser;
        this.prneomUser = prneomUser;
        this.mailUser = mailUser;
        this.id_Serv = id_Serv;
        this.catgorie_Serv = catgorie_Serv;
        this.id_rec = id_rec;
        this.desc_rec = desc_rec;
        this.date_rec = date_rec;
        this.raisonRec = raisonRec;
        this.nbre_rec = nbre_rec;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPrneomUser() {
        return prneomUser;
    }

    public void setPrneomUser(String prneomUser) {
        this.prneomUser = prneomUser;
    }

    public String getMailUser() {
        return mailUser;
    }

    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }

    public int getId_Serv() {
        return id_Serv;
    }

    public void setId_Serv(int id_Serv) {
        this.id_Serv = id_Serv;
    }

    public String getCatgorie_Serv() {
        return catgorie_Serv;
    }

    public void setCatgorie_Serv(String catgorie_Serv) {
        this.catgorie_Serv = catgorie_Serv;
    }

    public int getId_rec() {
        return id_rec;
    }

    public void setId_rec(int id_rec) {
        this.id_rec = id_rec;
    }

    public String getDesc_rec() {
        return desc_rec;
    }

    public void setDesc_rec(String desc_rec) {
        this.desc_rec = desc_rec;
    }

    public String getDate_rec() {
        return date_rec;
    }

    public void setDate_rec(String date_rec) {
        this.date_rec = date_rec;
    }

    public String getRaisonRec() {
        return raisonRec;
    }

    public void setRaisonRec(String raisonRec) {
        this.raisonRec = raisonRec;
    }

    

    public int getNbre_rec() {
        return nbre_rec;
    }

    public void setNbre_rec(int nbre_rec) {
        this.nbre_rec = nbre_rec;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.idUser;
        hash = 37 * hash + this.id_Serv;
        hash = 37 * hash + this.id_rec;
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
        final Rec_User_Service other = (Rec_User_Service) obj;
        if (this.idUser != other.idUser) {
            return false;
        }
        if (this.id_Serv != other.id_Serv) {
            return false;
        }
        if (this.id_rec != other.id_rec) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rec_User_Service{" + "idUser=" + idUser + ", nomUser=" + nomUser + ", prneomUser=" + prneomUser + ", mailUser=" + mailUser + ", id_Serv=" + id_Serv + ", catgorie_Serv=" + catgorie_Serv + ", id_rec=" + id_rec + ", desc_rec=" + desc_rec + ", date_rec=" + date_rec + ", rasion_rec=" + raisonRec + ", nbre_rec=" + nbre_rec + '}';
    }
    
    
    
}

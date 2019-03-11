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
public class OffreService {
    
    private int id_Serv;
    private int idUser;
    private String desc_Serv;
    private String date_Serv;
    private String catgorie_Serv;
    private int valid_Serv;
    
    public OffreService(){
        
    }

    public OffreService(int id_Serv, String desc_Serv, String date_Serv, String catgorie_Serv, int valid_Serv) {
        this.id_Serv = id_Serv;
        this.desc_Serv = desc_Serv;
        this.date_Serv = date_Serv;
        this.catgorie_Serv = catgorie_Serv;
        this.valid_Serv = valid_Serv;
    }

    public OffreService(String desc_Serv, String date_Serv, String catgorie_Serv, int valid_Serv) {
        this.desc_Serv = desc_Serv;
        this.date_Serv = date_Serv;
        this.catgorie_Serv = catgorie_Serv;
        this.valid_Serv = valid_Serv;
    }

    public OffreService(int id_Serv, int idUser, String desc_Serv, String date_Serv, String catgorie_Serv, int valid_Serv) {
        this.id_Serv = id_Serv;
        this.idUser = idUser;
        this.desc_Serv = desc_Serv;
        this.date_Serv = date_Serv;
        this.catgorie_Serv = catgorie_Serv;
        this.valid_Serv = valid_Serv;
    }

    public OffreService(int id_Serv, int idUser, String desc_Serv, String date_Serv) {
        this.id_Serv = id_Serv;
        this.idUser = idUser;
        this.desc_Serv = desc_Serv;
        this.date_Serv = date_Serv;
    }

    public OffreService(int id_Serv, int idUser, String desc_Serv, String date_Serv, String catgorie_Serv) {
        this.id_Serv = id_Serv;
        this.idUser = idUser;
        this.desc_Serv = desc_Serv;
        this.date_Serv = date_Serv;
        this.catgorie_Serv = catgorie_Serv;
    }

     
    
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    

    
    public int getId_Serv() {
        return id_Serv;
    }

    public void setId_Serv(int id_Serv) {
        this.id_Serv = id_Serv;
    }

    public String getDesc_Serv() {
        return desc_Serv;
    }

    public void setDesc_Serv(String desc_Serv) {
        this.desc_Serv = desc_Serv;
    }

    public String getDate_Serv() {
        return date_Serv;
    }

    public void setDate_Serv(String date_Serv) {
        this.date_Serv = date_Serv;
    }

    public String getCatgorie_Serv() {
        return catgorie_Serv;
    }

    public void setCatgorie_Serv(String catgorie_Serv) {
        this.catgorie_Serv = catgorie_Serv;
    }

    public int getValid_Serv() {
        return valid_Serv;
    }

    public void setValid_Serv(int valid_Serv) {
        this.valid_Serv = valid_Serv;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id_Serv;
        hash = 53 * hash + this.valid_Serv;
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
        final OffreService other = (OffreService) obj;
        if (this.id_Serv != other.id_Serv) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OffreService{" + "id_Serv=" + id_Serv + ", desc_Serv=" + desc_Serv + ", date_Serv=" + date_Serv + ", catgorie_Serv=" + catgorie_Serv + ", valid_Serv=" + valid_Serv + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TDC.esprit.ventePrivee.entities;

import java.sql.Date;

/**
 *
 * @author Chedli
 */
public class Service {
      private int id;
        private String description;
          private String duree;
            private String lieu;
              private String date_ajout;
              private String note_evaluation;
              private int idUser;

              
              public Service(){
                  
              }
    public Service(int id, String description, String duree, String lieu, String date_ajout, String note_evaluation) {
        this.id = id;
        this.description = description;
        this.duree = duree;
        this.lieu = lieu;
        this.date_ajout = date_ajout;
        this.note_evaluation = note_evaluation;
    }

    public Service(int id, String description, String duree, String lieu, String date_ajout, String note_evaluation, int idUser) {
        this.id = id;
        this.description = description;
        this.duree = duree;
        this.lieu = lieu;
        this.date_ajout = date_ajout;
        this.note_evaluation = note_evaluation;
        this.idUser = idUser;
    }

    
    
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDate_ajout() {
        return date_ajout;
    }

    public void setDate_ajout(String date_ajout) {
        this.date_ajout = date_ajout;
    }

   

    public String getNote_evaluation() {
        return note_evaluation;
    }

    public void setNote_evaluation(String note_evaluation) {
        this.note_evaluation = note_evaluation;
    }

    @Override
    public String toString() {
        return "Service{" + "id=" + id + ", description=" + description + ", duree=" + duree + ", lieu=" + lieu + ", date_ajout=" + date_ajout + ", note_evaluation=" + note_evaluation + '}';
    }
    
}

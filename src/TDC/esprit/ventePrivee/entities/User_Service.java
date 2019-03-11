/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.entities;

import java.io.InputStream;

/**
 *
 * @author Edzio
 */
public class User_Service {
    
    private int id_Serv;
    private String desc_Serv;//
    private String date_Serv;//
    private String catgorie_Serv;//
    private int valid_Serv;//
    private int idUser;
    private String nomUser;//
    private String prneomUser;//
    private String adressUser;
    private String mailUser;//
    private int telUser;//
    private String statutUser;
    private String loginUser;
    private String pwdUser;
    private String sexeUser;
    private InputStream photoUser;
    
    public User_Service(){
        
    }

    public User_Service(String desc_Serv, String date_Serv, String catgorie_Serv, int valid_Serv, String nomUser, String prneomUser, String mailUser, int telUser) {
        this.desc_Serv = desc_Serv;
        this.date_Serv = date_Serv;
        this.catgorie_Serv = catgorie_Serv;
        this.valid_Serv = valid_Serv;
        this.nomUser = nomUser;
        this.prneomUser = prneomUser;
        this.mailUser = mailUser;
        this.telUser = telUser;
    }

    public User_Service(int id_Serv, String desc_Serv, String date_Serv, String catgorie_Serv, int valid_Serv, int idUser, String nomUser, String prneomUser, String mailUser, int telUser) {
        this.id_Serv = id_Serv;
        this.desc_Serv = desc_Serv;
        this.date_Serv = date_Serv;
        this.catgorie_Serv = catgorie_Serv;
        this.valid_Serv = valid_Serv;
        this.idUser = idUser;
        this.nomUser = nomUser;
        this.prneomUser = prneomUser;
        this.mailUser = mailUser;
        this.telUser = telUser;
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

    public String getAdressUser() {
        return adressUser;
    }

    public void setAdressUser(String adressUser) {
        this.adressUser = adressUser;
    }

    public String getMailUser() {
        return mailUser;
    }

    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }

    public int getTelUser() {
        return telUser;
    }

    public void setTelUser(int telUser) {
        this.telUser = telUser;
    }

    public String getStatutUser() {
        return statutUser;
    }

    public void setStatutUser(String statutUser) {
        this.statutUser = statutUser;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getPwdUser() {
        return pwdUser;
    }

    public void setPwdUser(String pwdUser) {
        this.pwdUser = pwdUser;
    }

    public String getSexeUser() {
        return sexeUser;
    }

    public void setSexeUser(String sexeUser) {
        this.sexeUser = sexeUser;
    }

    public InputStream getPhotoUser() {
        return photoUser;
    }

    public void setPhotoUser(InputStream photoUser) {
        this.photoUser = photoUser;
    }
    
    
    
}

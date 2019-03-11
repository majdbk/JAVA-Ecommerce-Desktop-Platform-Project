/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.entities;

import java.io.InputStream;
import java.util.Objects;

/**
 *
 * @author Edzio
 */
public class User {
    
    private int idUser;
    private String nomUser;
    private String prneomUser;
    private String adressUser;
    private String mailUser;
    private int telUser;
    private String statutUser;
    private String loginUser;
    private String pwdUser;
    private String sexeUser;
    private InputStream photoUser;
    
   // public static int id_user_static_get;
    
    public User(){
        
    }   

    public User(int idUser, String nomUser, String prneomUser, String adressUser, String mailUser, int telUser, String statutUser, String loginUser, String pwdUser, String sexeUser, InputStream photoUser) {
        this.idUser = idUser;
        this.nomUser = nomUser;
        this.prneomUser = prneomUser;
        this.adressUser = adressUser;
        this.mailUser = mailUser;
        this.telUser = telUser;
        this.statutUser = statutUser;
        this.loginUser = loginUser;
        this.pwdUser = pwdUser;
        this.sexeUser = sexeUser;
        this.photoUser = photoUser;
    }

    public User(String nomUser, String prneomUser, String adressUser, String mailUser, int telUser, String statutUser, String loginUser, String pwdUser, String sexeUser, InputStream photoUser) {
        this.nomUser = nomUser;
        this.prneomUser = prneomUser;
        this.adressUser = adressUser;
        this.mailUser = mailUser;
        this.telUser = telUser;
        this.statutUser = statutUser;
        this.loginUser = loginUser;
        this.pwdUser = pwdUser;
        this.sexeUser = sexeUser;
        this.photoUser = photoUser;
    }

    public User(String nomUser, String prneomUser, String mailUser, int telUser) {
        this.nomUser = nomUser;
        this.prneomUser = prneomUser;
        this.mailUser = mailUser;
        this.telUser = telUser;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.idUser;
        hash = 53 * hash + Objects.hashCode(this.nomUser);
        hash = 53 * hash + Objects.hashCode(this.prneomUser);
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
        final User other = (User) obj;
        if (this.idUser != other.idUser) {
            return false;
        }
        if (!Objects.equals(this.nomUser, other.nomUser)) {
            return false;
        }
        if (!Objects.equals(this.prneomUser, other.prneomUser)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "idUser=" + idUser + ", nomUser=" + nomUser + ", prneomUser=" + prneomUser + ", adressUser=" + adressUser + ", mailUser=" + mailUser + ", telUser=" + telUser + ", statutUser=" + statutUser + ", loginUser=" + loginUser + ", pwdUser=" + pwdUser + ", sexeUser=" + sexeUser + ", photoUser=" + photoUser + '}';
    }
    
    
    
    
}

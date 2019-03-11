/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.entities;

import java.util.Objects;

/**
 *
 * @author Edzio
 */
public class Admin {
    
    private int id_Admin;
    private String nom_Admin;
    private String prnm_Admin;
    private int age_Admin;
    private String sex_Admin;
    private String email_Admin;
    private String login_Admin;
    private String pwd_Admin;
    private int connect;
    
    public static int id_admin_static;
    
    public Admin(){
        
    }
 
    public Admin(int id_Admin, String login_Admin, String pwd_Admin, int connect) {
        this.id_Admin = id_Admin;
        this.login_Admin = login_Admin;
        this.pwd_Admin = pwd_Admin;
        this.connect = connect;
    }

    
    
    public Admin(int id_Admin, String login_Admin, String pwd_Admin) {
        this.id_Admin = id_Admin;
        this.login_Admin = login_Admin;
        this.pwd_Admin = pwd_Admin;
    }

    public Admin(int id_Admin, String nom_Admin, String prnm_Admin, int age_Admin, String sex_Admin, String email_Admin, String login_Admin, String pwd_Admin) {
        this.id_Admin = id_Admin;
        this.nom_Admin = nom_Admin;
        this.prnm_Admin = prnm_Admin;
        this.age_Admin = age_Admin;
        this.sex_Admin = sex_Admin;
        this.email_Admin = email_Admin;
        this.login_Admin = login_Admin;
        this.pwd_Admin = pwd_Admin;
    }

    public Admin(String nom_Admin, String prnm_Admin, int age_Admin, String sex_Admin, String email_Admin, String login_Admin, String pwd_Admin) {
        this.nom_Admin = nom_Admin;
        this.prnm_Admin = prnm_Admin;
        this.age_Admin = age_Admin;
        this.sex_Admin = sex_Admin;
        this.email_Admin = email_Admin;
        this.login_Admin = login_Admin;
        this.pwd_Admin = pwd_Admin;
    }

    public int getConnect() {
        return connect;
    }

    public void setConnect(int connect) {
        this.connect = connect;
    }

    
    
    public String getNom_Admin() {
        return nom_Admin;
    }

    public void setNom_Admin(String nom_Admin) {
        this.nom_Admin = nom_Admin;
    }

    public String getPrnm_Admin() {
        return prnm_Admin;
    }

    public void setPrnm_Admin(String prnm_Admin) {
        this.prnm_Admin = prnm_Admin;
    }

    public int getAge_Admin() {
        return age_Admin;
    }

    public void setAge_Admin(int age_Admin) {
        this.age_Admin = age_Admin;
    }

    public String getSex_Admin() {
        return sex_Admin;
    }

    public void setSex_Admin(String sex_Admin) {
        this.sex_Admin = sex_Admin;
    }

    public String getEmail_Admin() {
        return email_Admin;
    }

    public void setEmail_Admin(String email_Admin) {
        this.email_Admin = email_Admin;
    }

    public static int getId_admin_static() {
        return id_admin_static;
    }

    public static void setId_admin_static(int id_admin_static) {
        Admin.id_admin_static = id_admin_static;
    }

    
    public int getId_Admin() {
        return id_Admin;
    }

    public void setId_Admin(int id_Admin) {
        this.id_Admin = id_Admin;
    }

    public String getLogin_Admin() {
        return login_Admin;
    }

    public void setLogin_Admin(String login_Admin) {
        this.login_Admin = login_Admin;
    }

    public String getPwd_Admin() {
        return pwd_Admin;
    }

    public void setPwd_Admin(String pwd_Admin) {
        this.pwd_Admin = pwd_Admin;
    }

    @Override
    public String toString() {
        return "Admin{" + "id_Admin=" + id_Admin + ", login_Admin=" + login_Admin + ", pwd_Admin=" + pwd_Admin + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + this.id_Admin;
        hash = 37 * hash + Objects.hashCode(this.login_Admin);
        hash = 37 * hash + Objects.hashCode(this.pwd_Admin);
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
        final Admin other = (Admin) obj;
        if (this.id_Admin != other.id_Admin) {
            return false;
        }
        if (!Objects.equals(this.login_Admin, other.login_Admin)) {
            return false;
        }
        if (!Objects.equals(this.pwd_Admin, other.pwd_Admin)) {
            return false;
        }
        return true;
    }
    
    
   
}

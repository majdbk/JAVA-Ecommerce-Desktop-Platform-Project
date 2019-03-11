/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDC.esprit.ventePrivee.GUI;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 *
 * @author Edzio
 */
class SmtpAuthenticator extends Authenticator{
    
    @Override
    public PasswordAuthentication getPasswordAuthentication() {
    String username = "user";
    String password = "password";
    if ((username != null) && (username.length() > 0) && (password != null) 
      && (password.length   () > 0)) {
        char[] pwd=password.toCharArray();
        return new PasswordAuthentication(username, pwd);
    }

    return null;
  }
     
   public SmtpAuthenticator(){
       super();
   }  
}

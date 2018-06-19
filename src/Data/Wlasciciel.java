/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import javax.swing.JPasswordField;

/**
 *
 * @author Aleksandra
 */
public class Wlasciciel {
   protected String imię;
   protected String nazwisko;
   protected String login;
   protected String hasło;
   protected String localhost;
   protected int port;
    
    
    public Wlasciciel(String imię, String nazwisko, String login, String hasło,
            String localhost, int port){
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.login = login;
        this.hasło = hasło;
        this.localhost = localhost;
        this.port = port;
        
}

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHasło() {
        return hasło;
    }

    public void setHasło(String hasło) {
        this.hasło = hasło;
    }

    public String getLocalhost() {
        return localhost;
    }

    public void setLocalhost(String localhost) {
        this.localhost = localhost;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
  
   public String Informacje(){
       return imię + " " + nazwisko; 
   }
     
}

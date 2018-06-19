 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


public class Dane {

    protected String imię;
    protected String nazwisko;
    protected String email;
    protected String nazwa_firmy;
    protected String notatki;
    boolean firma;
    
    
    public Dane(String imię, String nazwisko, String email, String nazwa_firmy,
            String notatki, boolean firma){
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.email = email;
        this.nazwa_firmy = nazwa_firmy;
        this.notatki = notatki;
        this.firma = firma;
        
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

    public String getNazwa() {
        return nazwa_firmy;
    }

    public void setNazwa(String nazwa_firmy) {
        this.nazwa_firmy = nazwa_firmy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotatki() {
        return notatki;
    }

    public void setNotatki(String notatki) {
        this.notatki = notatki;
    }

    public boolean isFirma() {
        return firma;
    }

    public void setFirma(boolean firma) {
        this.firma = firma;
    }
  
   
   public String Informacje(){
       if(firma == true){
            return nazwa_firmy;
       }else{
            return imię + " " + nazwisko;  
       }
       
   }
    
}



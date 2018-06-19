/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Date;

/**
 *
 * @author Aleksandra
 */
public class WiadomosciOdebraneDane {
    protected String eOdbiorca;
    protected String email;
    protected String temat;
    protected String localhost;
    protected int port;
    protected Date data;
    protected String tresc;
    protected String zalacznik;
    
    public WiadomosciOdebraneDane(String eOdbiorca, String temat,String email, String localhost,
            int port, Date data, String tresc, String zalacznik){
        
        this.eOdbiorca = eOdbiorca;
        this.temat = temat;
        this.email = email;
        this.localhost = localhost;
        this.port = port;
        this.data = data;
        this.tresc = tresc;
        this.zalacznik = zalacznik;
    }

    public String getZalacznik() {
        return zalacznik;
    }

    public String geteOdbiorca() {
        return eOdbiorca;
    }

    public void seteOdbiorca(String eOdbiorca) {
        this.eOdbiorca = eOdbiorca;
    }

    public String getTemat() {
        return temat;
    }

    public void setTemat(String temat) {
        this.temat = temat;
    }
    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }
    
    public String Info(){
        return "Od:" + email + " | Temat: " + temat + " | Data: " + data;
    }

    public String ZwrocTresc() {
        return tresc;
    }
    
    
}

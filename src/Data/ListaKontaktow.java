/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Data.Dane;
import java.util.LinkedList;


public class ListaKontaktow {
    protected LinkedList<Dane> dane;
    
    public ListaKontaktow(){
        dane = new LinkedList<>();
    }
    
    public String[] getInfo(){
        String[] rob = new String[dane.size()];
        int i = 0;
        for(Dane d : dane){
            rob[i++] = d.Informacje();
        }
        return rob;
    }  
    
    public String getSzczegoly(int idx){
        return dane.get(idx).Informacje();
    }
    
    public void dodajKontakt(Dane d){
        dane.add(d);
    }

    
    public void usunKontakt(int index){
        dane.remove(index);
    }
    
    public int getIndex(){
        return dane.size();
    }

}

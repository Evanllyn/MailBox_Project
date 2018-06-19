/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.LinkedList;

/**
 *
 * @author Aleksandra
 */
public class WiadomosciOdebrane {
    
    protected LinkedList<WiadomosciOdebraneDane> wiad;
    
    public WiadomosciOdebrane(){
        wiad = new LinkedList<>();
    }
    
    public String[] Info(){
        String[] rob = new String[wiad.size()];
        int i = 0;
        for(WiadomosciOdebraneDane w : wiad){
        rob[i++] = w.Info();
    }
        return rob;
    }
    
    public void dodajWiadomosci(WiadomosciOdebraneDane w){
        wiad.add(w);
    }
    
    public void usunWiadomosci(int index){
        wiad.remove(index);
    }
    
    public String ZwrocTrescWiad(int indx){
        return wiad.get(indx).ZwrocTresc();
    }
    public String ZwrocTematWiad(int indx){
        return wiad.get(indx).getTemat();
    }
    public String ZwrocNadawceWiad(int indx){
        return wiad.get(indx).geteOdbiorca();
    }
    public String ZwrocZalacznikWiad(int indx){
        return wiad.get(indx).getZalacznik();
    }
    public String ZwrocEmailWiad(int indx){
        return wiad.get(indx).getemail();
    }
}

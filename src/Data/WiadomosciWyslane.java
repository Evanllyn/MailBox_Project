/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.LinkedList;


public class WiadomosciWyslane {
    
    protected LinkedList<WiadomosciWyslaneDane> wiad;
    
    public WiadomosciWyslane(){
        wiad = new LinkedList<>();
    }
    
    public String[] Info(){
        String[] rob = new String[wiad.size()];
        int i = 0;
        for(WiadomosciWyslaneDane w : wiad){
        rob[i++] = w.ZworcInfo();
    }
        return rob;
    }
    
    public void dodajWiadomosc(WiadomosciWyslaneDane w){
        wiad.add(w);
    }
    
    public void usunWiadomosci(int index){
        wiad.remove(index);
    }
    
    public String Informacja(WiadomosciWyslaneDane w){
        return w.ZwrocTresc();
    }
    public String ZwrocTrescWiad(int indx){
        return wiad.get(indx).ZwrocTresc();
    }
    public String ZwrocTematWiad(int indx){
        return wiad.get(indx).getTemat();
    }
    public String ZwrocNadawceWiad(int indx){
        return wiad.get(indx).eNadawca;
    }
    public String ZwrocZalacznikWiad(int indx){
        return wiad.get(indx).zalacznik;
    }
    
    public String ZwrocEmailWiad(int indx){
        return wiad.get(indx).getemail();
    }
}

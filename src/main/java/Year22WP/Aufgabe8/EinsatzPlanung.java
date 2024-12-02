package Year22WP.Aufgabe8;

import java.util.HashMap;

public class EinsatzPlanung{

    private HashMap<Rentier, Integer> einsatz = new HashMap<>();

    public boolean plusVerwendung(Rentier rentier, int minuten){
        if(rentier == null || minuten < 0) return false;
        if(!einsatz.containsKey(rentier)) einsatz.put(rentier, minuten);
        int update = einsatz.remove(rentier);
        try{
            minuten += update;
        } catch(Exception e){
            einsatz.put(rentier, update);
            return false;
        }
        einsatz.put(rentier, minuten);
        return true;
    }
    public boolean minusVerwendung(Rentier rentier, int minuten){
        if(rentier == null || minuten < 0 || !einsatz.containsKey(rentier)) return false;
        int update = einsatz.get(rentier);
        int newupdate = minuten - update;
        if(newupdate <= 0){
            einsatz.put(rentier, update);
            return false;
        }
        einsatz.put(rentier, newupdate);
        return true;
    }

}

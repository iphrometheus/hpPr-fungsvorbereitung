package Year22WP.Aufgabe8;

import java.util.HashMap;

public class EinsatzPlanung {
    private HashMap<Rentier, Integer> einsatz = new HashMap<>();

    public boolean plusVerwendung(Rentier rentier, int minuten){
        if(rentier == null || minuten <= 0){
            return false;
        }
        int got = einsatz.getOrDefault(rentier, 0);

        if(got > Integer.MAX_VALUE - minuten) return false;
        einsatz.put(rentier, got+minuten);
        return true;
    }

    public boolean minusVerwendung(Rentier rentier, int minuten){
        if(rentier == null || minuten <= 0){
            return false;
        }
        Integer got = einsatz.get(rentier);
        if(got == null || (got - minuten) < 0) return false;
        einsatz.put(rentier, got - minuten);
        return true;
    }
}

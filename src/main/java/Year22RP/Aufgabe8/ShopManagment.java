package Year22RP.Aufgabe8;

import java.util.HashMap;

public class ShopManagment {
    private HashMap<Part, Integer> stock = new HashMap<>();

    public boolean addPart(Part part, int amount){
        if(part == null || amount <= 0) return false;

        Integer tmp = stock.get(part);
        if(tmp > Integer.MAX_VALUE - amount){ /// prüft ob tmp größer ist als die max anzahl die noch addiert werden kann
            return false;
        }
        
        stock.put(part, tmp + amount);
        return true;
    }

    public boolean removePart(Part part, int amount){
        if(part == null || amount <= 0) return false;

        Integer tmp = stock.get(part);
        if(tmp == null) return false;
        int x = tmp - amount;
        if(x < 0){
            return false;
        } if (x == 0) {
            stock.remove(part);
        } else {
            stock.put(part, x);
        }
        return true;
    }
}

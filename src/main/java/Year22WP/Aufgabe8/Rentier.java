package Year22WP.Aufgabe8;

import java.util.HashMap;

public class Rentier {
    public final String name;

    private Rentier(String name) {
        this.name = name;
    }

    public static Rentier withName(String name) {
        return name == null ? null : new Rentier(name);
    }

    public String getName(){ return name;}
}


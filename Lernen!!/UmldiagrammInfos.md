# UML Diagramme

```java
public class Test(){
    public String getName(){ //public
        return "Linus";
    }
    String greet(){ // package-private!!
        return "Hallo";
    }
    private String sayBye(){ // private
        return "ByeBye";
    }
    protected String okay(){ // protected
        return "Test";
    }
}
```

### Sichtbarkeiten:

| Sichtbarkeit    | Symbol in UML |
|-----------------|:-------------:|
| public          |       +       |
| package-private |       ~       |
| private         |       -       |
| protected       |       #       |

### Interfaces mit Parameterisierbaren Variablen

Wenn eine Klasse aus einem Interface implementiert wird welches Parametriesierbar ist und die Klasse parametriesiert implementiert wird muss beim interface ```<<bind>> <Parameter-> Typ> ``` dabei sein:

```java
// siehe 2020 Wiederholungsprüfung
public Interface Orderable<O>{
    void placeOrder(O);
    O handleOrder();
}

public class Item implements Orderable<Integer>{
    @Override
    public void placeOrder(Integer order){
        //abgekürzt
        return;
    }

    @Override
    public Integer handleOrder(){
        // abgekürzt
        return null;
    }
}
```


<p align=center> || <br>\/</p>


```uml
                     _______________________________
                    | <<interface>> Orderable [O]   |
                    |_______________________________|
                    | + placeOrder(O): void         |
                    | + handleOrder(): O            |
                    |_______________________________|
                                    /\
                                   /  \
                                  /    \
                                    |

                                    | <<bind>> <O -> Integer>
            
                                    |
                     _______________________________
                    |             Item              |
                    |_______________________________|
                    |+ placeOrder(Integer): void    |
                    |+ handleOrder(): Integer       |
                    |_______________________________|
```
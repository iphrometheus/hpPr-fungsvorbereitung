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


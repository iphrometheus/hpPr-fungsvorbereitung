package Year22RP.Aufgabe8;

public class Part {
    private String name;
    private Long price;
    public Part(String name, long price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public Long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Part [name=" + name + ", price=" + price + "]";
    }
}

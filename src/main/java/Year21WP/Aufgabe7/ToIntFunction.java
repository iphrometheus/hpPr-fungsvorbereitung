package Year21WP.Aufgabe7;

@FunctionalInterface
public interface ToIntFunction <T>{
    int applyAsInt(T value);
}

import java.util.LinkedList;

public class Cache<T> {
    private final int capacity;
    private final LinkedList<T> storage;

    public Cache(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("кэш должен быть больше нуля " + n);
        }
        this.capacity = n;
        this.storage = new LinkedList<>();
    }
}

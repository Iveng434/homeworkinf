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

    public void add(T item) {
        storage.addLast(item);

        if (storage.size() > capacity) {
            storage.removeFirst();
        }
    }
    
    public boolean remove(T item) {
        return storage.remove(item);
    }
    public boolean exists(T item) {
        return storage.contains(item);
    }
    public T getFirst() {
        if (storage.isEmpty()) {
            return null;
        }
        return storage.getFirst();
    }
    public T getLast() {
        if (storage.isEmpty()) {
            return null;
        }
        return storage.getLast();
    }
    public T getItemByIndex(int i) {
        if (i < 0 || i >= storage.size()) {
            return null;
        }
        return storage.get(i);
    }
}

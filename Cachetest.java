public class Cachetest {
    public static void main(String[] args) {
        Cache<String> cache = new Cache<>(3);

        cache.add("A");
        cache.add("B");
        cache.add("C");

        System.out.println("Первый: " + cache.getFirst());
        System.out.println("Последний: " + cache.getLast());

        System.out.println("Есть A: " + cache.exists("A"));

        System.out.println("Индекс 0: " + cache.getItemByIndex(0));
        System.out.println("Индекс 1: " + cache.getItemByIndex(1));
        System.out.println("Индекс 2: " + cache.getItemByIndex(2));


        System.out.println("Удалено B: " + cache.remove("B"));

    }
}

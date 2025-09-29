
// hash таблица
import java.util.HashMap;

public class HashTable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        System.out.println(map.get("key1"));
    }
}

// Бинарная куча
import java.util.PriorityQueue;

public class BinaryHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.add(3);
        heap.add(1);
        heap.add(2);
        System.out.println(heap);
    }
}


// Биноминальная куча
public class BinomialHeap {
    public BinomialHeap() {}
    public static void main(String[] args) {
        BinomialHeap heap = new BinomialHeap();
        System.out.println("BinomialHeap initialized");
    }
}


// Куча Фибоначчи
public class FibHeap {
    public FibHeap() {}
    public static void main(String[] args) {
        FibHeap heap = new FibHeap();
        System.out.println("Fibonacci Heap initialized");
    }
}

Map<String, Integer> map = new HashMap<>();
map.put("apple", 1);
map.put("banana", 2);
map.put("orange", 3);
//based on key
Map<String, Integer> sortedMap = new TreeMap<>(map); 

//based on value
Map<String, Integer> map = new HashMap<>();
map.put("apple", 1);
map.put("banana", 2);
map.put("orange", 3);

List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        Integer value1 = o1.getValue();
        Integer value2 = o2.getValue();
        return value1.compareTo(value2);
    }
});

Map<String, Integer> sortedMap = new LinkedHashMap<>();
for (Map.Entry<String, Integer> entry : list) {
    sortedMap.put(entry.getKey(), entry.getValue());
}

//sorted
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("orange");

        // Print the TreeSet
        System.out.println("TreeSet: " + treeSet);
    }
}

//hash
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");

        // Print the HashSet
        System.out.println("HashSet: " + hashSet);

        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("orange");

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}



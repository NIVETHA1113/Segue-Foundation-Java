import java.util.*;

public class CountOccurence {
    public static void main(String[] args) {
        String[] books = {"dsa", "os", "java", "java", "maths", "os", "sql", "sql"};
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String book : books) {
            map.put(book, map.getOrDefault(book, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

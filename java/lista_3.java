import java.util.HashMap;
import java.util.Map;

public class lista_3 {
    public static void numberOfOccurrences(String input) {
        String[] words = input.toLowerCase().split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("Word: '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
        }
    }

    public static void main(String[] args) {
        String input = "To jest przykladowe zdanie. To zdanie jest tylko przykladowe.";
        numberOfOccurrences(input.toLowerCase());
    }
}

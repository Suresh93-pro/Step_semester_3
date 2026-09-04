package week2_assignment;
import java.util.*;
public class StopWordFilteredWordFrequencyReport {
    public static void printFilteredWordFrequency(String feedback) {
        Set<String> stopWords = new HashSet<>(Arrays.asList("the","was","and","a","is","of","in"));
        String cleaned = feedback.toLowerCase().replace(".", "").replace(",", "");
        String[] words = cleaned.split("\\s+");
        Map<String,Integer> frequency = new HashMap<>();
        for (String word : words) {
            if (!stopWords.contains(word)) frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }
        List<Map.Entry<String,Integer>> entries = new ArrayList<>(frequency.entrySet());
        entries.sort((a,b) -> b.getValue().compareTo(a.getValue()));
        for (Map.Entry<String,Integer> e : entries) System.out.println(e.getKey() + ": " + e.getValue());
    }
    public static void main(String[] args) { printFilteredWordFrequency("The mentor was great, the session was great and clear."); }
}

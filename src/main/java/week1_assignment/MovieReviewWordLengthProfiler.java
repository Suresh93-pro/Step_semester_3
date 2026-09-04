package week1_assignment;
public class MovieReviewWordLengthProfiler {
    public static void classifyWordLengths(String review) {
        int shortCount = 0, mediumCount = 0, longCount = 0;
        String[] words = review.trim().split("\\s+");
        for (String word : words) {
            word = word.replaceAll("[^A-Za-z]", "");
            int n = word.length();
            if (n >= 1 && n <= 4) shortCount++;
            else if (n <= 8) mediumCount++;
            else if (n >= 9) longCount++;
        }
        System.out.println("Short: " + shortCount + " | Medium: " + mediumCount + " | Long: " + longCount);
    }
    public static void main(String[] args) { classifyWordLengths("This movie was absolutely fantastic and thrilling"); }
}

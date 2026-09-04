package week1_assignment;
public class TypingSpeedTestAccuracyChecker {
    public static void checkTypingAccuracy(String original, String typed) {
        int total = Math.min(original.length(), typed.length());
        int matched = 0, firstMismatch = -1;
        for (int i = 0; i < total; i++) {
            if (original.charAt(i) == typed.charAt(i)) matched++;
            else if (firstMismatch == -1) firstMismatch = i;
        }
        double accuracy = original.length() == 0 ? 100.0 : (matched * 100.0 / original.length());
        if (firstMismatch == -1 && original.length() == typed.length())
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n", matched, original.length(), accuracy);
        else {
            if (firstMismatch == -1) firstMismatch = total;
            char expected = firstMismatch < original.length() ? original.charAt(firstMismatch) : '-';
            char actual = firstMismatch < typed.length() ? typed.charAt(firstMismatch) : '-';
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matched, original.length(), accuracy, firstMismatch + 1, expected, actual);
        }
    }
    public static void main(String[] args) { checkTypingAccuracy("hello world", "hello worlt"); }
}

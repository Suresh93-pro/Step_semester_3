package week1_assignment;
public class TrafficSignalStreakAnalyzer {
    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) return;
        char longestColor = signalLog.charAt(0), currentColor = longestColor;
        int longest = 1, current = 1;
        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentColor) current++;
            else { currentColor = signalLog.charAt(i); current = 1; }
            if (current > longest) { longest = current; longestColor = currentColor; }
        }
        System.out.println("Longest Streak: '" + longestColor + "' repeated " + longest + " times");
    }
    public static void main(String[] args) { findLongestStreak("RRGGGYRR"); }
}

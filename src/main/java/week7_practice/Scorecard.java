package week7_practice;

public class Scorecard {
    private final boolean[] results;
    private int count;

    public Scorecard(int questions) { results = new boolean[questions]; }
    public void recordAnswer(boolean correct) {
        if (count < results.length) results[count++] = correct;
    }
    public int getScore() {
        int score = 0;
        for (int i = 0; i < count; i++) if (results[i]) score++;
        return score;
    }

    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);
        sc.recordAnswer(true); sc.recordAnswer(true); sc.recordAnswer(false); sc.recordAnswer(true);
        System.out.println(sc.getScore());
    }
}

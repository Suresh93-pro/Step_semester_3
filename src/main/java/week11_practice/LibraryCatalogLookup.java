import java.util.Scanner;

public class LibraryCatalogLookup {
    static String findBook(String[] isbn, String[] titles, String target) {
        int low = 0, high = isbn.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = isbn[mid].compareTo(target);
            if (cmp == 0) return titles[mid];
            if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] isbn = new String[n], titles = new String[n];
        for (int i = 0; i < n; i++) { isbn[i] = sc.next(); titles[i] = sc.next(); }
        System.out.println(findBook(isbn, titles, sc.next()));
    }
}
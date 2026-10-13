import java.util.*;

public class LibraryLateFineCounter {
    abstract static class Item {
        String title; int daysLate;
        Item(String title, int daysLate) { this.title = title; this.daysLate = daysLate; }
        abstract double fine();
    }
    static class Book extends Item { Book(String t, int d) { super(t, d); } double fine() { return daysLate * 2.0; } }
    static class DVD extends Item { DVD(String t, int d) { super(t, d); } double fine() { return Math.min(daysLate * 5.0, 50.0); } }
    static class Magazine extends Item { Magazine(String t, int d) { super(t, d); } double fine() { return daysLate; } }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double total = 0;
        for (int i = 0; i < n; i++) {
            String[] p = sc.nextLine().trim().split("\\s+");
            Item item;
            switch (p[0]) {
                case "BOOK": item = new Book(p[1], Integer.parseInt(p[2])); break;
                case "DVD": item = new DVD(p[1], Integer.parseInt(p[2])); break;
                case "MAGAZINE": item = new Magazine(p[1], Integer.parseInt(p[2])); break;
                default: throw new IllegalArgumentException("Unknown item type");
            }
            System.out.printf("%s: %.2f%n", item.title, item.fine());
            total += item.fine();
        }
        System.out.printf("Total Fines: %.2f%n", total);
    }
}
import java.util.*;

public class ElectricityConnectionBilling {
    abstract static class Connection {
        double units;
        Connection(double units) { this.units = units; }
        abstract double bill();
    }
    static class Home extends Connection {
        Home(double u) { super(u); }
        double bill() { return Math.min(units, 100) * 5 + Math.max(0, units - 100) * 7; }
    }
    static class Shop extends Connection {
        Shop(double u) { super(u); }
        double bill() { return units * 8 + 100; }
    }
    static class Factory extends Connection {
        Factory(double u) { super(u); }
        double bill() { return Math.max(units * 6, 1000); }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double total = 0;
        for (int i = 0; i < n; i++) {
            String[] p = sc.nextLine().trim().split("\\s+");
            double units = Double.parseDouble(p[1]);
            Connection c;
            switch (p[0]) {
                case "HOME": c = new Home(units); break;
                case "SHOP": c = new Shop(units); break;
                case "FACTORY": c = new Factory(units); break;
                default: throw new IllegalArgumentException("Unknown connection type");
            }
            System.out.printf("%s: %.2f%n", p[0], c.bill());
            total += c.bill();
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
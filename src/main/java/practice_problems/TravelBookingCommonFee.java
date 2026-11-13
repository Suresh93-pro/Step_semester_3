import java.util.*;

public class TravelBookingCommonFee {
    abstract static class Booking {
        static final double BOOKING_FEE = 50.0;
        double distance;
        Booking(double distance) { this.distance = distance; }
        abstract double baseFare();
        double total() { return baseFare() + BOOKING_FEE; }
    }
    static class Bus extends Booking { Bus(double d) { super(d); } double baseFare() { return distance * 2; } }
    static class Train extends Booking { Train(double d) { super(d); } double baseFare() { return distance * 1.5; } }
    static class Flight extends Booking { Flight(double d) { super(d); } double baseFare() { return 2500 + distance * 4; } }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String[] p = sc.nextLine().trim().split("\\s+");
            double distance = Double.parseDouble(p[1]);
            Booking b;
            switch (p[0]) {
                case "BUS": b = new Bus(distance); break;
                case "TRAIN": b = new Train(distance); break;
                case "FLIGHT": b = new Flight(distance); break;
                default: throw new IllegalArgumentException("Unknown travel mode");
            }
            System.out.printf("%s: %.2f%n", p[0], b.total());
        }
    }
}
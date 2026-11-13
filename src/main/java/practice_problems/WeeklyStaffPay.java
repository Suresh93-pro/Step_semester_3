import java.util.*;

public class WeeklyStaffPay {
    abstract static class Staff {
        String name;
        Staff(String name) { this.name = name; }
        abstract double pay();
    }
    static class FullTime extends Staff {
        double salary;
        FullTime(String name, double salary) { super(name); this.salary = salary; }
        double pay() { return salary; }
    }
    static class Hourly extends Staff {
        double hours, rate;
        Hourly(String name, double hours, double rate) { super(name); this.hours = hours; this.rate = rate; }
        double pay() { return Math.min(hours, 40) * rate + Math.max(0, hours - 40) * rate * 1.5; }
    }
    static class Intern extends Staff {
        double stipend;
        Intern(String name, double stipend) { super(name); this.stipend = stipend; }
        double pay() { return stipend; }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double total = 0;
        for (int i = 0; i < n; i++) {
            String[] p = sc.nextLine().trim().split("\\s+");
            Staff s;
            switch (p[0]) {
                case "FULLTIME": s = new FullTime(p[1], Double.parseDouble(p[2])); break;
                case "HOURLY": s = new Hourly(p[1], Double.parseDouble(p[2]), Double.parseDouble(p[3])); break;
                case "INTERN": s = new Intern(p[1], Double.parseDouble(p[2])); break;
                default: throw new IllegalArgumentException("Unknown staff type");
            }
            System.out.printf("%s: %.2f%n", s.name, s.pay());
            total += s.pay();
        }
        System.out.printf("Total Payroll: %.2f%n", total);
    }
}
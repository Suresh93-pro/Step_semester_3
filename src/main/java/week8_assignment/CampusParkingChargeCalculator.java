package week8_assignment;
import java.util.*;
public class CampusParkingChargeCalculator {
 interface Vehicle{double charge();String type();}
 static class Bike implements Vehicle{int h;Bike(int h){this.h=h;}public double charge(){return 10*h;}public String type(){return "BIKE";}}
 static class Car implements Vehicle{int h;Car(int h){this.h=h;}public double charge(){return h==0?0:30+20*(h-1);}public String type(){return "CAR";}}
 static class Truck implements Vehicle{int h;Truck(int h){this.h=h;}public double charge(){return Math.max(100,50*h);}public String type(){return "TRUCK";}}
 public static void main(String[]args){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();int h=s.nextInt();Vehicle v=t.equals("BIKE")?new Bike(h):t.equals("CAR")?new Car(h):new Truck(h);double c=v.charge();total+=c;System.out.printf("%s: %.2f%n",v.type(),c);}System.out.printf("Total: %.2f%n",total);}
}

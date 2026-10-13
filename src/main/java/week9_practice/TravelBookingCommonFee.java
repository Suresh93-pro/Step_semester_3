import java.util.*;
public class TravelBookingCommonFee {
 abstract static class Booking {static final double FEE=50;double d;Booking(double d){this.d=d;}abstract double fare();double total(){return fare()+FEE;}}
 static class Bus extends Booking {Bus(double d){super(d);}double fare(){return d*2;}}
 static class Train extends Booking {Train(double d){super(d);}double fare(){return d*1.5;}}
 static class Flight extends Booking {Flight(double d){super(d);}double fare(){return 2500+d*4;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=Integer.parseInt(s.nextLine().trim());for(int i=0;i<n;i++){String[] p=s.nextLine().trim().split("\\s+");double d=Double.parseDouble(p[1]);Booking x;
 switch(p[0]){case "BUS":x=new Bus(d);break;case "TRAIN":x=new Train(d);break;case "FLIGHT":x=new Flight(d);break;default:throw new IllegalArgumentException();}
 System.out.printf("%s: %.2f%n",p[0],x.total());}}
}

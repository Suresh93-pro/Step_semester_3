package week8_practice;

import java.util.*;

public class PublicTransportFareCalculator {
    interface Transport { double fare(); String type(); }
    static class Bus implements Transport {double d;Bus(double d){this.d=d;}public double fare(){return Math.min(10,2+.1*d);}public String type(){return "BUS";}}
    static class Train implements Transport {double d;Train(double d){this.d=d;}public double fare(){return 3+.15*d;}public String type(){return "TRAIN";}}
    static class Metro implements Transport {double d,f;Metro(double d,double f){this.d=d;this.f=f;}public double fare(){return (1.5+.2*d)*f;}public String type(){return "METRO";}}
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String t=sc.next();double d=sc.nextDouble();Transport x=t.equals("BUS")?new Bus(d):t.equals("TRAIN")?new Train(d):new Metro(d,sc.nextDouble());double v=x.fare();total+=v;System.out.printf("%s: %.2f%n",x.type(),v);}System.out.printf("Total: %.2f%n",total);}
}

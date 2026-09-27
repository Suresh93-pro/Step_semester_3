package week8_practice;

import java.util.*;

public class DeliveryFeeCalculator {
    interface Delivery { double fee(); String type(); }
    static class Standard implements Delivery {double w,d;Standard(double w,double d){this.w=w;this.d=d;}public double fee(){return 5+.5*w+.1*d;}public String type(){return "STANDARD";}}
    static class Express implements Delivery {double w,d;Express(double w,double d){this.w=w;this.d=d;}public double fee(){return 15+w+.2*d;}public String type(){return "EXPRESS";}}
    static class International implements Delivery {double w,d,c;International(double w,double d,double c){this.w=w;this.d=d;this.c=c;}public double fee(){return 25+2*w+.5*d+c;}public String type(){return "INTERNATIONAL";}}
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String t=sc.next();double w=sc.nextDouble(),d=sc.nextDouble();Delivery x;if(t.equals("STANDARD"))x=new Standard(w,d);else if(t.equals("EXPRESS"))x=new Express(w,d);else x=new International(w,d,sc.nextDouble());double f=x.fee();total+=f;System.out.printf("%s: %.2f%n",x.type(),f);}System.out.printf("Total: %.2f%n",total);}
}

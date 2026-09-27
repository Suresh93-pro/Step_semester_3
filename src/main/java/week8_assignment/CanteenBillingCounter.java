package week8_assignment;

import java.util.*;
public class CanteenBillingCounter {
    interface Customer { double finalAmount(); String type(); }
    static class Student implements Customer {double a;Student(double a){this.a=a;}public double finalAmount(){return a*.9;}public String type(){return "STUDENT";}}
    static class Staff implements Customer {double a;Staff(double a){this.a=a;}public double finalAmount(){return a*.95;}public String type(){return "STAFF";}}
    static class Guest implements Customer {double a;Guest(double a){this.a=a;}public double finalAmount(){return a+10;}public String type(){return "GUEST";}}
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String t=sc.next();double a=sc.nextDouble();Customer c=t.equals("STUDENT")?new Student(a):t.equals("STAFF")?new Staff(a):new Guest(a);double v=c.finalAmount();total+=v;System.out.printf("%s: %.2f%n",c.type(),v);}System.out.printf("Total: %.2f%n",total);}
}

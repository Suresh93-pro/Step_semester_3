import java.util.*;
public class WeeklyStaffPay {
 abstract static class Staff {String name;Staff(String n){name=n;}abstract double pay();}
 static class FullTime extends Staff {double salary;FullTime(String n,double v){super(n);salary=v;}double pay(){return salary;}}
 static class Hourly extends Staff {double h,r;Hourly(String n,double h,double r){super(n);this.h=h;this.r=r;}double pay(){return Math.min(h,40)*r+Math.max(0,h-40)*r*1.5;}}
 static class Intern extends Staff {double stipend;Intern(String n,double v){super(n);stipend=v;}double pay(){return stipend;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=Integer.parseInt(s.nextLine().trim());double total=0;for(int i=0;i<n;i++){String[] p=s.nextLine().trim().split("\\s+");Staff x;
 switch(p[0]){case "FULLTIME":x=new FullTime(p[1],Double.parseDouble(p[2]));break;case "HOURLY":x=new Hourly(p[1],Double.parseDouble(p[2]),Double.parseDouble(p[3]));break;case "INTERN":x=new Intern(p[1],Double.parseDouble(p[2]));break;default:throw new IllegalArgumentException();}
 System.out.printf("%s: %.2f%n",x.name,x.pay());total+=x.pay();}System.out.printf("Total Payroll: %.2f%n",total);}
}

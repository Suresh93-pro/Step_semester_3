package week8_assignment;
import java.util.*;
public class FestivalBonusCalculator {
 interface Employee{double bonus();String name();}
 static class FullTime implements Employee{String n;double s;FullTime(String n,double s){this.n=n;this.s=s;}public double bonus(){return s*.1;}public String name(){return n;}}
 static class PartTime implements Employee{String n;double s;PartTime(String n,double s){this.n=n;this.s=s;}public double bonus(){return s*.05;}public String name(){return n;}}
 static class Intern implements Employee{String n;double s;Intern(String n,double s){this.n=n;this.s=s;}public double bonus(){return 2000;}public String name(){return n;}}
 public static void main(String[]args){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next(),name=s.next();double sal=s.nextDouble();Employee e=t.equals("FULLTIME")?new FullTime(name,sal):t.equals("PARTTIME")?new PartTime(name,sal):new Intern(name,sal);double b=e.bonus();total+=b;System.out.printf("%s: %.2f%n",e.name(),b);}System.out.printf("Total Bonus: %.2f%n",total);}
}

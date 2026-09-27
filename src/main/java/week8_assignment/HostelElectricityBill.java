package week8_assignment;
import java.util.*;
public class HostelElectricityBill {
 interface Room{double bill();String type();}
 static class Single implements Room{double u;Single(double u){this.u=u;}public double bill(){return 8*u;}public String type(){return "SINGLE";}}
 static class Shared implements Room{double u;int o;Shared(double u,int o){this.u=u;this.o=o;}public double bill(){return 6*u/o;}public String type(){return "SHARED";}}
 static class AC implements Room{double u;AC(double u){this.u=u;}public double bill(){return 10*u+200;}public String type(){return "AC";}}
 public static void main(String[]args){Scanner s=new Scanner(System.in);int n=s.nextInt();double total=0;for(int i=0;i<n;i++){String t=s.next();double u=s.nextDouble();Room r=t.equals("SINGLE")?new Single(u):t.equals("SHARED")?new Shared(u,s.nextInt()):new AC(u);double b=r.bill();total+=b;System.out.printf("%s: %.2f%n",r.type(),b);}System.out.printf("Total: %.2f%n",total);}
}

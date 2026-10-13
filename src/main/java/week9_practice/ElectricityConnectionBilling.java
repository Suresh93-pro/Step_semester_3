import java.util.*;
public class ElectricityConnectionBilling {
 abstract static class Connection {double u;Connection(double u){this.u=u;}abstract double bill();}
 static class Home extends Connection {Home(double u){super(u);}double bill(){return Math.min(u,100)*5+Math.max(0,u-100)*7;}}
 static class Shop extends Connection {Shop(double u){super(u);}double bill(){return u*8+100;}}
 static class Factory extends Connection {Factory(double u){super(u);}double bill(){return Math.max(u*6,1000);}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=Integer.parseInt(s.nextLine().trim());double total=0;for(int i=0;i<n;i++){String[] p=s.nextLine().trim().split("\\s+");double u=Double.parseDouble(p[1]);Connection x;
 switch(p[0]){case "HOME":x=new Home(u);break;case "SHOP":x=new Shop(u);break;case "FACTORY":x=new Factory(u);break;default:throw new IllegalArgumentException();}
 System.out.printf("%s: %.2f%n",p[0],x.bill());total+=x.bill();}System.out.printf("Total: %.2f%n",total);}
}

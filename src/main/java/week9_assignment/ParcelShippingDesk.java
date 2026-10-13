import java.util.*;
public class ParcelShippingDesk {
 interface Insurable {double insurance();}
 abstract static class Parcel {double w,v;Parcel(double w,double v){this.w=w;this.v=v;}abstract double charge();double insurance(){return 0;}double total(){return charge()+insurance();}}
 static class Standard extends Parcel {Standard(double w,double v){super(w,v);}double charge(){return 40+10*w;}}
 static class Express extends Parcel implements Insurable {Express(double w,double v){super(w,v);}double charge(){return 80+15*w;}public double insurance(){return v*.02;}}
 static class Fragile extends Parcel implements Insurable {Fragile(double w,double v){super(w,v);}double charge(){return 40+10*w+50;}public double insurance(){return v*.02;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=Integer.parseInt(s.nextLine().trim());double total=0;for(int i=0;i<n;i++){String[] p=s.nextLine().trim().split("\\s+");Parcel x;double w=Double.parseDouble(p[1]),v=Double.parseDouble(p[2]);
 switch(p[0]){case "STANDARD":x=new Standard(w,v);break;case "EXPRESS":x=new Express(w,v);break;case "FRAGILE":x=new Fragile(w,v);break;default:throw new IllegalArgumentException();}
 System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",p[0],x.charge(),x.insurance(),x.total());total+=x.total();}System.out.printf("Grand Total: %.2f%n",total);}
}

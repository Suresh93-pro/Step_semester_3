import java.util.*;
public class HomeApplianceEnergyReport {
 interface SaverMode {default double save(double u){return u*.75;}}
 abstract static class Appliance {double h;Appliance(double h){this.h=h;}abstract double power();double units(){return power()*h/1000;}double cost(double u){return u*8;}}
 static class Fridge extends Appliance {Fridge(double h){super(h);}double power(){return 150;}}
 static class AC extends Appliance implements SaverMode {AC(double h){super(h);}double power(){return 1500;}}
 static class TV extends Appliance {TV(double h){super(h);}double power(){return 100;}}
 static class Washer extends Appliance implements SaverMode {Washer(double h){super(h);}double power(){return 500;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=Integer.parseInt(s.nextLine().trim());double total=0;for(int i=0;i<n;i++){String[] p=s.nextLine().trim().split("\\s+");String type=p[0];double h=Double.parseDouble(p[1]);boolean saver=p.length>2&&p[2].equals("SAVER");Appliance x;
 switch(type){case "FRIDGE":x=new Fridge(h);break;case "AC":x=new AC(h);break;case "TV":x=new TV(h);break;case "WASHER":x=new Washer(h);break;default:throw new IllegalArgumentException();}
 if(saver&&!(x instanceof SaverMode)){System.out.println(type+": saver mode not supported");continue;}double u=x.units();if(saver)u=((SaverMode)x).save(u);double c=x.cost(u);System.out.printf("%s: Units=%.2f Cost=%.2f%n",type,u,c);total+=c;}System.out.printf("Total Cost: %.2f%n",total);}
}

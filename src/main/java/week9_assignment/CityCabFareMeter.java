import java.util.*;
public class CityCabFareMeter {
 interface NightService {default double nightFare(double fare){return fare*1.2;}}
 abstract static class Cab {double km;Cab(double k){km=k;}abstract double rate();double base(){return Math.max(100,km*rate());}}
 static class Mini extends Cab {Mini(double k){super(k);}double rate(){return 10;}}
 static class Sedan extends Cab implements NightService {Sedan(double k){super(k);}double rate(){return 14;}}
 static class SUV extends Cab implements NightService {SUV(double k){super(k);}double rate(){return 18;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=Integer.parseInt(s.nextLine().trim());double total=0;for(int i=0;i<n;i++){String[] p=s.nextLine().trim().split("\\s+");String type=p[0],time=p[2];Cab x;double km=Double.parseDouble(p[1]);
 switch(type){case "MINI":x=new Mini(km);break;case "SEDAN":x=new Sedan(km);break;case "SUV":x=new SUV(km);break;default:throw new IllegalArgumentException();}
 if(time.equals("NIGHT")&&!(x instanceof NightService)){System.out.println(type+": night service not available");continue;}double f=x.base();if(time.equals("NIGHT"))f=((NightService)x).nightFare(f);System.out.printf("%s: %.2f%n",type,f);total+=f;}System.out.printf("Total: %.2f%n",total);}
}

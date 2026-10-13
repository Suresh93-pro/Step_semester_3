import java.util.*;
public class CollegeFeeCounter {
 interface BusUser {double TRANSPORT_FEE=12000;}
 abstract static class Student {String name;Student(String n){name=n;}abstract double tuition();double extra(){return 0;}boolean usesBus(){return false;}double fee(){return tuition()+extra()+(usesBus()?BusUser.TRANSPORT_FEE:0);}}
 static class DayScholar extends Student implements BusUser {DayScholar(String n){super(n);}double tuition(){return 40000;}boolean usesBus(){return true;}}
 static class Hosteller extends Student {Hosteller(String n){super(n);}double tuition(){return 40000;}double extra(){return 60000;}}
 static class Scholar extends Student implements BusUser {Scholar(String n){super(n);}double tuition(){return 20000;}boolean usesBus(){return true;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=Integer.parseInt(s.nextLine().trim());double total=0;for(int i=0;i<n;i++){String[] p=s.nextLine().trim().split("\\s+");Student x;
 switch(p[0]){case "DAY_SCHOLAR":x=new DayScholar(p[1]);break;case "HOSTELLER":x=new Hosteller(p[1]);break;case "SCHOLAR":x=new Scholar(p[1]);break;default:throw new IllegalArgumentException();}
 System.out.printf("%s: %.2f%n",x.name,x.fee());total+=x.fee();}System.out.printf("Total Collected: %.2f%n",total);}
}

package week8_assignment;
import java.time.*;import java.util.*;
public class StreamingPlanRenewalReminder {
 interface Plan{LocalDate renewal();String name();}
 static class Basic implements Plan{String n;LocalDate d;Basic(String n,LocalDate d){this.n=n;this.d=d;}public LocalDate renewal(){return d.plusDays(30);}public String name(){return n;}}
 static class Standard implements Plan{String n;LocalDate d;Standard(String n,LocalDate d){this.n=n;this.d=d;}public LocalDate renewal(){return d.plusDays(90);}public String name(){return n;}}
 static class Premium implements Plan{String n;LocalDate d;Premium(String n,LocalDate d){this.n=n;this.d=d;}public LocalDate renewal(){return d.plusDays(365);}public String name(){return n;}}
 public static void main(String[]args){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=0;i<n;i++){String t=s.next(),name=s.next(),date=s.next();LocalDate d=LocalDate.parse(date);Plan p=t.equals("BASIC")?new Basic(name,d):t.equals("STANDARD")?new Standard(name,d):new Premium(name,d);System.out.println(p.name()+": "+p.renewal());}}
}

import java.util.*;
public class MovieTicketCounter {
 abstract static class Ticket {static final double FEE=20;int n;Ticket(int n){this.n=n;}abstract double price();double amount(){return n*(price()+FEE);}}
 static class Regular extends Ticket {Regular(int n){super(n);}double price(){return 150;}}
 static class Premium extends Ticket {Premium(int n){super(n);}double price(){return 250;}}
 static class Recliner extends Ticket {Recliner(int n){super(n);}double price(){return 400;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=Integer.parseInt(s.nextLine().trim());double total=0;for(int i=0;i<n;i++){String[] p=s.nextLine().trim().split("\\s+");int c=Integer.parseInt(p[1]);Ticket x;
 switch(p[0]){case "REGULAR":x=new Regular(c);break;case "PREMIUM":x=new Premium(c);break;case "RECLINER":x=new Recliner(c);break;default:throw new IllegalArgumentException();}
 System.out.printf("%s: %.2f%n",p[0],x.amount());total+=x.amount();}System.out.printf("Total: %.2f%n",total);}
}

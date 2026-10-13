import java.util.*;
public class LibraryLateFineCounter {
 abstract static class Item {String title;int days;Item(String t,int d){title=t;days=d;}abstract double fine();}
 static class Book extends Item {Book(String t,int d){super(t,d);}double fine(){return days*2.0;}}
 static class DVD extends Item {DVD(String t,int d){super(t,d);}double fine(){return Math.min(days*5.0,50);}}
 static class Magazine extends Item {Magazine(String t,int d){super(t,d);}double fine(){return days;}}
 public static void main(String[] z){Scanner s=new Scanner(System.in);int n=Integer.parseInt(s.nextLine().trim());double total=0;for(int i=0;i<n;i++){String[] p=s.nextLine().trim().split("\\s+");Item x;
 switch(p[0]){case "BOOK":x=new Book(p[1],Integer.parseInt(p[2]));break;case "DVD":x=new DVD(p[1],Integer.parseInt(p[2]));break;case "MAGAZINE":x=new Magazine(p[1],Integer.parseInt(p[2]));break;default:throw new IllegalArgumentException();}
 System.out.printf("%s: %.2f%n",x.title,x.fine());total+=x.fine();}System.out.printf("Total Fines: %.2f%n",total);}
}

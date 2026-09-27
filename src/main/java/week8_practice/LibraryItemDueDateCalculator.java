package week8_practice;

import java.time.LocalDate;
import java.util.*;

public class LibraryItemDueDateCalculator {
    interface Item { String title(); LocalDate dueDate(); }
    static LocalDate today=LocalDate.of(2023,10,26);
    static class Book implements Item {String t;Book(String t){this.t=t;}public String title(){return t;}public LocalDate dueDate(){return today.plusDays(14);}}
    static class DVD implements Item {String t;DVD(String t){this.t=t;}public String title(){return t;}public LocalDate dueDate(){return today.plusDays(7);}}
    static class Magazine implements Item {String t;Magazine(String t){this.t=t;}public String title(){return t;}public LocalDate dueDate(){return today.plusDays(3);}}
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();sc.nextLine();for(int i=0;i<n;i++){String line=sc.nextLine().trim();int p=line.indexOf(' ');String type=line.substring(0,p);String title=line.substring(p+1).replace("\"","").trim();Item x=switch(type){case "BOOK"->new Book(title);case "DVD"->new DVD(title);default->new Magazine(title);};System.out.println(x.title()+": "+x.dueDate());}}
}

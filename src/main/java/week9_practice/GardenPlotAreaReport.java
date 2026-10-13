import java.util.*;
public class GardenPlotAreaReport {
 abstract static class Plot { String owner; Plot(String o){owner=o;} abstract double area(); abstract String shape(); }
 static class Circle extends Plot { double r; Circle(String o,double r){super(o);this.r=r;} double area(){return Math.PI*r*r;} String shape(){return "CIRCLE";} }
 static class Rectangle extends Plot { double l,w; Rectangle(String o,double l,double w){super(o);this.l=l;this.w=w;} double area(){return l*w;} String shape(){return "RECTANGLE";} }
 static class Triangle extends Plot { double b,h; Triangle(String o,double b,double h){super(o);this.b=b;this.h=h;} double area(){return .5*b*h;} String shape(){return "TRIANGLE";} }
 public static void main(String[] args){Scanner s=new Scanner(System.in);int n=Integer.parseInt(s.nextLine().trim());double total=0;
 for(int i=0;i<n;i++){String[] p=s.nextLine().trim().split("\\s+");Plot x;
 switch(p[0]){case "CIRCLE":x=new Circle(p[1],Double.parseDouble(p[2]));break;case "RECTANGLE":x=new Rectangle(p[1],Double.parseDouble(p[2]),Double.parseDouble(p[3]));break;case "TRIANGLE":x=new Triangle(p[1],Double.parseDouble(p[2]),Double.parseDouble(p[3]));break;default:throw new IllegalArgumentException();}
 System.out.printf("%s (%s): %.2f%n",x.owner,x.shape(),x.area());total+=x.area();}System.out.printf("Total Area: %.2f%n",total);}
}

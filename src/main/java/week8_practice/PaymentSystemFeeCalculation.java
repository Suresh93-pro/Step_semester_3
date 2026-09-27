package week8_practice;

import java.util.*;

public class PaymentSystemFeeCalculation {
    interface Payment { double adjusted(); String type(); }
    static class Card implements Payment { double amount; Card(double a){amount=a;} public double adjusted(){return amount*1.02;} public String type(){return "CARD";} }
    static class Wallet implements Payment { double amount; Wallet(double a){amount=a;} public double adjusted(){return amount*1.01;} public String type(){return "WALLET";} }
    static class BankTransfer implements Payment { double amount; BankTransfer(double a){amount=a;} public double adjusted(){return amount;} public String type(){return "BANKTRANSFER";} }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); double total=0;
        for(int i=0;i<n;i++){String type=sc.next(); double a=sc.nextDouble(); Payment p=switch(type){case "CARD"->new Card(a);case "WALLET"->new Wallet(a);default->new BankTransfer(a);}; double v=p.adjusted(); total+=v; System.out.printf("%s: %.2f%n",p.type(),v);}
        System.out.printf("Total: %.2f%n",total);
    }
}

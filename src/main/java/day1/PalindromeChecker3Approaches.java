package day1;
public class PalindromeChecker3Approaches {
    public static boolean isPalindromeIterative(String text) {
        int l=0,r=text.length()-1;
        while(l<r) if(text.charAt(l++) != text.charAt(r--)) return false;
        return true;
    }
    public static boolean isPalindromeRecursive(String text) {
        if(text.length()<=1) return true;
        if(text.charAt(0)!=text.charAt(text.length()-1)) return false;
        return isPalindromeRecursive(text.substring(1,text.length()-1));
    }
    public static boolean isPalindromeArrayReversal(String text) {
        char[] a=text.toCharArray();
        for(int i=0,j=a.length-1;i<j;i++,j--){ char t=a[i]; a[i]=a[j]; a[j]=t; }
        return text.equals(new String(a));
    }
    public static void main(String[] args) {
        String text="madam";
        System.out.println("Iterative: "+(isPalindromeIterative(text)?"Palindrome":"Not Palindrome"));
        System.out.println("Recursive: "+(isPalindromeRecursive(text)?"Palindrome":"Not Palindrome"));
        System.out.println("Array Reversal: "+(isPalindromeArrayReversal(text)?"Palindrome":"Not Palindrome"));
    }
}

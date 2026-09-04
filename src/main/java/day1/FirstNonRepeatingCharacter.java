package day1;
import java.util.*;
public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeatingChar(String text) {
        Map<Character,Integer> freq=new HashMap<>();
        for(char c:text.toCharArray()) freq.put(c,freq.getOrDefault(c,0)+1);
        for(char c:text.toCharArray()) if(freq.get(c)==1) return c;
        return '\0';
    }
    public static void main(String[] args) {
        char c=findFirstNonRepeatingChar("swiss");
        System.out.println(c=='\0'?"No Non-Repeating Character Found":"First Non-Repeating Character: '"+c+"'");
    }
}

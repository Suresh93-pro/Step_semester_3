package week8_practice;

import java.util.*;
import java.util.regex.*;

public class ExaminationQuestionGrader {
    static double grade(String type,String correct,String student,int points){
        if(type.equals("MCQ")||type.equals("TF")) return student.equals(correct)?points:0;
        String[] keys=correct.split(","); int found=0; String s=student.toLowerCase();
        for(String k:keys) if(s.contains(k.trim().toLowerCase())) found++;
        if(found>=2)return points*.75; if(found==1)return points*.5; return 0;
    }
    public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=Integer.parseInt(sc.nextLine().trim());Pattern p=Pattern.compile("\\\"([^\\\"]*)\\\"");double total=0;for(int i=0;i<n;i++){String line=sc.nextLine();String type=line.substring(0,line.indexOf(' '));Matcher m=p.matcher(line);List<String>a=new ArrayList<>();while(m.find())a.add(m.group(1));String tail=line.substring(line.lastIndexOf('"')+1).trim();int points=Integer.parseInt(tail);double score=grade(type,a.get(1),a.get(2),points);total+=score;System.out.printf("%s: %.2f%n",type,score);}System.out.printf("Total Score: %.2f%n",total);}
}

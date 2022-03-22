 import java.util.*;
public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse().toString());
        sc.close();
    }
    
}

/*
o/p
PS C:\DailyAssignments\Day14> javac Concat.java
PS C:\DailyAssignments\Day14> java Concat
shreya
kashyap
shreyakashyap
PS C:\DailyAssignments\Day14> javac ReverseString.java
PS C:\DailyAssignments\Day14> java ReverseString
shreya
ayerhs
*/
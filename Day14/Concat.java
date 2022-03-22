import java.util.*;
class Concat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str=str1+str2;
        System.out.println(str);
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
*/
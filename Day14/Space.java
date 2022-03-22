
    import java.util.regex.*;
import java.util.*;
public class Space{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    Pattern r=Pattern.compile("\\s+");
    Matcher m=r.matcher(str);
    String result=m.replaceAll(" ");
    System.out.println(result);
    sc.close();

      }
}

/*
o/p
PS C:\DailyAssignments\Day14> javac Space.java
PS C:\DailyAssignments\Day14> java Space
a line       with multiple               space
a line with multiple space
*/
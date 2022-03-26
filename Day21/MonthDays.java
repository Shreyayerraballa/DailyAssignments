 import java.util.*;
public class MonthDays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int month=num/30;
        int days=num%30;
        System.out.println(month + "months and " + days + "days");
        sc.close();
    }
    
}

/*
PS C:\DailyAssignments\Day21> javac MonthDays.java
PS C:\DailyAssignments\Day21> java MonthDays
98
3months and 8days
*/

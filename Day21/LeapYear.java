import java.util.*;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if((year%400==0) || ((year%100!=0) && (year%4==0))){
            System.out.println(year + " year is a leap year" );
        }
        else{
            System.out.println(year + "year is not  a leap year");
        }
    sc.close();
    }
        
    
}
/*
PS C:\DailyAssignments\Day21> javac LeapYear.java
PS C:\DailyAssignments\Day21> java LeapYear
2001
2001year is not  a leap year
*/


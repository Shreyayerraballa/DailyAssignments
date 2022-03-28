import java.util.*;
public class CountDownRecursion {
    public static void countdown(int n){
    for(int i=n;i>=0;i--){
        System.out.print(i+" ");
    }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        countdown(n);
        sc.close();
    }
}
   
/* o/p 
PS C:\DailyAssignments\Day24> javac CountDownRecursion.java
PS C:\DailyAssignments\Day24> java CountDownRecursion
5
5 4 3 2 1 0 
*/
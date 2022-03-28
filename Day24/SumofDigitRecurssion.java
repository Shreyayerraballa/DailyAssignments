
    import java.util.*;
public class SumofDigitRecurssion {
    static int sumofdigit(int n){
        if(n==0){
            return 0;
        }
        else{
            return(n%10+sumofdigit(n/10));
       }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=sumofdigit(n);
        System.out.println(result);
        sc.close();
    }
    
}

/* o/p
PS C:\DailyAssignments\Day24> javac SumofDigitRecurssion.java
PS C:\DailyAssignments\Day24> java SumofDigitRecurssion
123456
21
*/
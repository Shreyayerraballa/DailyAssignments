
    import java.util.*;
    public class FactorialRecursion{
        static int factorial(int n){
            if(n==0){
                return 1;
            }
            else{
                return(n*factorial(n-1));
            }
        }
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int fact=1;
            int num=sc.nextInt();
            fact=factorial(num);
            System.out.println("factorial of "+num+ "is "+ fact);
            sc.close();
        }
    } 

/* o/p
PS C:\DailyAssignments\Day24> javac FactorialRecursion.java
PS C:\DailyAssignments\Day24> java FactorialRecursion
12
factorial of 12is 479001600
*/

    import java.util.*;
    public class Factorial {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            int fact=1;
            if(num>=0){
                for(int i=1;i<=num;i++){
              fact=fact*i;
            }
        }
        else{
            System.out.println("enter number is negative");
        }
            System.out.println("factorial of given number is : "+fact);
            sc.close();
        }
        
    }  

    /*
    o/p
    PS C:\DailyAssignments\Day21> javac Factorial.java 
PS C:\DailyAssignments\Day21> java Factorial
12
factorial of given number is : 479001600
*/


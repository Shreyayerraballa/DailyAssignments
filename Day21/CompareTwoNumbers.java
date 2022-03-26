      import java.util.*;
    public class CompareTwoNumbers {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter first number : ");
            int num1=sc.nextInt();
            System.out.println("enter second number : ");
            int num2=sc.nextInt();
            if(num1>num2){
                System.out.println(num1 + "is greater than "+num2);
            }
            else if(num1==num2){
                System.out.println(num1 + "is equals to "+num2);
            }
            else{
                System.out.println(num1 + "is less than "+num2);
            }
            sc.close();
        }
        
    }

/*
o/p
PS C:\DailyAssignments\Day21> javac CompareTwoNumbers.java
PS C:\DailyAssignments\Day21> java CompareTwoNumbers
enter first number : 
3
enter second number : 
5
3is less than 5
*/
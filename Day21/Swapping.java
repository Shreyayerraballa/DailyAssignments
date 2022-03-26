
    import java.util.*;
public class Swapping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1 : ");
        int num1=sc.nextInt();
        System.out.println("enter num2 : ");
        int num2=sc.nextInt();
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("numbers after swapping : ");
        System.out.println("num1 value : "+num1 +" num2 value : "+num2);
        sc.close();
        
    }
    
}

/*
o/p
PS C:\DailyAssignments\Day21> javac Swapping.java
PS C:\DailyAssignments\Day21> java Swapping
enter num1 : 
12
enter num2 : 
22
numbers after swapping : 
num1 value : 22 num2 value : 12
*/


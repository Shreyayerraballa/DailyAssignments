
    import java.util.*;
public class ReverseNumberRecursion {
    public static void reverseNumber(int num){
    if(num<10){
       System.out.print(num);
        return;
    }
    else{
        System.out.print(num%10);
        reverseNumber(num/10);
    }
}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("reverse number is : ");
        reverseNumber(n);
        sc.close();
    }
    
}

/* o/p
PS C:\DailyAssignments\Day24> javac ReverseNumberRecursion.java
PS C:\DailyAssignments\Day24> java ReverseNumberRecursion
123456
reverse number is : 654321
*/
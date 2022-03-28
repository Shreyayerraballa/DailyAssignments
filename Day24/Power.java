
   import java.util.Scanner;
   public class Power {
       public static void main(String[] args)
   {
   Scanner sc =new Scanner(System.in);
   System.out.println("enter a base");
    int base=sc.nextInt();
    System.out.println("enter a power");
    int power=sc.nextInt();
    int k=(int) Math.pow(base,power);
    System.out.println("number after power");
    System.out.println(k);
    sc.close();
   }    
   }
/* o/p
PS C:\DailyAssignments\Day24> javac Power.java
PS C:\DailyAssignments\Day24> java Power     
enter a base
2
enter a power
4
number after power
16
*/

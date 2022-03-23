
    import java.util.*;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1 + "  " + n2+" ");
        for(int i=2;i<n;i++){
            n3=n1+n2;
        System.out.print(n3+ " ");
        n1=n2;
        n2=n3;
        }
        sc.close();
    }
}

/*abstracto/p
PS C:\DailyAssignments\Day19> javac Fibonacci.java 
PS C:\DailyAssignments\Day19> java Fibonacci
12
0  1 1 2 3 5 8 13 21 34 55 89
*/
import java.util.*;
public class Factors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" " );
            }
        }
        sc.close();

    }
    
}

    
/*
o/p
PS C:\DailyAssignments\Day19> javac Factors.java
PS C:\DailyAssignments\Day19> java Factors
12
1 2 3 4 6 12
*/
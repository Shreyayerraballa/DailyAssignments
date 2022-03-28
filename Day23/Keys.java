import java.util.*;
class Keys{
      static int maximum(int n){
        if(n<=6)
           return n;
        int max=0;
        for(int i=n-3;i>=1;i--){
            int curr=(n-i-1)*maximum(i);
         if(curr>max)
             max=curr;
         }
         return max;
         }
      public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             int num=sc.nextInt();
                  System.out.println("maximum number of A's are:"+maximum(num));
       sc.close();
     }
}



/*
 o/p

C:\DailyAssignments\Day23>javac Keys.java

C:\DailyAssignments\Day23>java Keys
3
maximum number of A's are:3
*/
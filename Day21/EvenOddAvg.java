
    import java.util.*;
public class EvenOddAvg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        double evenavg=0,oddavg=0;
         int evensum=0,oddsum=0;
        int evencount=0,oddcount=0;
        for(int i=0;i<num;i++){
            if(i%2==0){
                evensum+=i;
                evencount++;
            }
            else{
                oddsum+=i;
                oddcount++;
            }
        }
        evenavg=evensum/evencount;
        oddavg=oddsum/oddcount;
        System.out.println("average of even numbers are :"+evenavg);
        System.out.println("average of odd numbers are :"+oddavg);
        sc.close();


    }
    
}
 
/*
PS C:\DailyAssignments\Day21> javac EvenOddAvg.java
PS C:\DailyAssignments\Day21> java EvenOddAvg 
12
average of even numbers are :5.0
average of odd numbers are :6.0
*/

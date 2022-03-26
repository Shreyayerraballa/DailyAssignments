
    import java.util.*;
    public class EvenNumber{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
           for(int i=1;i<=num;i++){
               int list=i%2;
           if(list==0){
            System.out.println(" the even no.s are : " +i);
           }
          
        }
    
            sc.close();
        }
    } 

/*
PS C:\DailyAssignments\Day21> javac EvenNumber.java
PS C:\DailyAssignments\Day21> java EvenNumber
20
 the even no.s are : 2
 the even no.s are : 4
 the even no.s are : 6
 the even no.s are : 8
 the even no.s are : 10
 the even no.s are : 12
 the even no.s are : 14
 the even no.s are : 16
 the even no.s are : 18
 the even no.s are : 20
 */
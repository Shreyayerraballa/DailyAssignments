
    import java.util.*;
    public class Harmonicseries {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            double result=0.0;
            while(num>0){
                result=result+(double)1/num;
                num--;
                System.out.println(result + " ");
            }
            sc.close();
        }
    } 

/*
o/p
PS C:\DailyAssignments\Day21> javac Harmonicseries.java
PS C:\DailyAssignments\Day21> java Harmonicseries
12
0.08333333333333333 
0.17424242424242425 
0.2742424242424243  
0.3853535353535354  
0.5103535353535353  
0.6532106782106781  
0.8198773448773448  
1.0198773448773448  
1.2698773448773448  
1.603210678210678   
2.103210678210678   
3.103210678210678 
*/
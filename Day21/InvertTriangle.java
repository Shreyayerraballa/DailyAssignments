
    import java.util.*;
    public class InvertTriangle {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int i=n,j;
            while(i>0){
                j=0;
                while(j++<i){
    System.out.print("*");
                }
            
                System.out.println();
                i--;
            }
            sc.close();
        }
    } 

/*PS C:\DailyAssignments\Day21> javac InvertTriangle.java
PS C:\DailyAssignments\Day21> java InvertTriangle
6
******
***** 
****  
***   
**    
*    
*/ 
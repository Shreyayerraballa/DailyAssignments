
    import java.util.*;
    public class DecimaltoBinaryRecursion {
    static int find(int decimalnumber){
        if(decimalnumber==0) {

            return 0;
        }
        else{
            return(decimalnumber%2+10*find(decimalnumber/2));
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int decimalnumber=sc.nextInt();
        System.out.println(find(decimalnumber));
        sc.close();
    }
    
}

/* o/p
PS C:\DailyAssignments\Day24> javac DecimaltoBinaryRecursion.java
PS C:\DailyAssignments\Day24> java DecimaltoBinaryRecursion
1
1
*/
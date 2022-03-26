
    import java.util.*;
public class Cummulativesum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int numbers[]=new int[n];
        for(int i=0; i<n; i++){
            numbers[i]=sc.nextInt();
        }
            int sum[]=cummulativeSum(numbers);
            System.out.println(Arrays.toString(sum));
            sc.close();
        }
        
       public static  int[] cummulativeSum(int[] numbers){
            int sum=0;
            for(int i=0; i<numbers.length; i++){
                sum+=numbers[i];
                numbers[i]=sum;
            }
            return numbers;
        }
    }

/* o/p
PS C:\DailyAssignments\Day22> javac Cummulativesum.java
PS C:\DailyAssignments\Day22> java Cummulativesum
4
1 2 3 4 5
[1, 3, 6, 10]
*/
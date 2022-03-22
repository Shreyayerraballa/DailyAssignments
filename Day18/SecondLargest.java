
    import java.util.*;
public class SecondLargest {
    public  static int  seclar(int[] arr,int total){
        Arrays.sort(arr);
        return arr[total-2];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
            }
           int temp = SecondLargest.seclar(arr, n);
           System.out.println(" the second largest no. in array : "+temp);
            sc.close();
        }
    }


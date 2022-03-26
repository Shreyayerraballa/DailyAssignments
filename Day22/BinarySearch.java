
 
   
import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array ");
        int n=sc.nextInt();
        System.out.println("enter key to search");
        int key=sc.nextInt();
        int arr[] = new int[n];
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int result=Arrays.binarySearch(arr,key);
        if(result<0){
            System.out.println("element not found");
        }
        else {
            System.out.println("element found at index : " +result);
        }
        sc.close();
    }
    
}   

/* o/p
enter size of array 
4
enter key to search
2
12
4
8
6
element not found
*/
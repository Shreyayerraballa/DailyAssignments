
    import java.util.*;
public class FizzBuzz {
    public static void main(String args[]){
    
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        int arr[]=new int[n];
        for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%3==0){
                 System.out.print(" fizz ");
                
            }
            else if(arr[i]%5==0){
                    System.out.print(" Buzz ");
                }
                else if(arr[i]%3==0 && arr[i]%5 ==0){
                    System.out.print(" FizzBuzz ");
                }
                else{
                    System.out.print(arr[i]+" ");
                }
        }
        sc.close();
    }
}


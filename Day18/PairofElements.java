
    import java.util.*;
    class PairOfElements {
       public static void main(String args[]){
           int i,count=0;
           Scanner sc=new Scanner(System.in);
           int sum=sc.nextInt();
           int n=sc.nextInt();
           int arr[]=new int[n];
           for( i=0;i<n;i++){
               arr[i]=sc.nextInt();
               System.out.println("The array of the elements: "+arr[i]+" ");
           }
           for(i=0;i<n;i++){
               for(int j=i+1;j<n;j++){
                   if((arr[i]+arr[j])==sum){
                       count++;
                   }
                       
               }
   
           }
           System.out.println("The count of the pairs whose sum is equals to the given sum: "+count );
               
       }
       }
    


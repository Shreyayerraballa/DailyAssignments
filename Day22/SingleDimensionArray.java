
    import java.util.*;
public class SingleDimensionArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            temp=arr;
            sum=sum+arr[i];
            double avg=sum/n;
            System.out.println("the array elements are : " + arr[i]);
            System.out.println("the array elements are : " + Arrays.toString(temp));
            System.out.println("average of the array elements is : "+avg);
            if(arr[i]>avg){
                System.out.println("the number greater than average  : "+arr[i]);
            }
            else{
                System.out.println("their is no number greate than average");
            }
    }
        

        System.out.println("length of the array " +arr.length);
        System.out.println("sum of elements in array : " +sum);
        Arrays.sort(arr);
        for(int j=0;j<n;j++){
            System.out.println("sorted array elements are : "+arr[j]);
        }
        System.out.println("smallest number in array is : "+arr[0]);
        System.out.println("largest number in array is : " +arr[n-1]);
        System.out.println(" second largest number in array is : " +arr[n-2]);
        sc.close();
    }
}

/* o/p 
PS C:\DailyAssignments\Day22> javac SingleDimensionArray.java
PS C:\DailyAssignments\Day22> java SingleDimensionArray
5
5 4 3 2 1
the array elements are : 5
the array elements are : [5, 0, 0, 0, 0]
average of the array elements is : 1.0
the number greater than average  : 5
the array elements are : 4
the array elements are : [5, 4, 0, 0, 0]
average of the array elements is : 1.0
the number greater than average  : 4
the array elements are : 3
the array elements are : [5, 4, 3, 0, 0]
average of the array elements is : 2.0
the number greater than average  : 3
the array elements are : 2
the array elements are : [5, 4, 3, 2, 0]
average of the array elements is : 2.0
their is no number greate than average
the array elements are : 1
the array elements are : [5, 4, 3, 2, 1]
average of the array elements is : 3.0
their is no number greate than average
length of the array 5
sum of elements in array : 15
sorted array elements are : 1
sorted array elements are : 2
sorted array elements are : 3
sorted array elements are : 4
sorted array elements are : 5
smallest number in array is : 1
largest number in array is : 5
 second largest number in array is : 4
 */

    import java.util.Scanner;
public class Bubblesort {
    public static void printArray(int array[],int size)
    {
        for(int i=0;i<size;i++)
        System.out.print(array[i]+" ");
    }
    public static void sort(int array[],int size)
    {
        for(int i=0; i<size;i++)
        {
            for(int j=0; j<size; j++)
            {
                if(j!=size-1)
                {
                    if(array[j]>array[j+1])
                    {
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }
        }
        printArray(array,size);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0; i<size; i++)
            arr[i]=scan.nextInt();
        scan.close();
        System.out.println("Before sorting:");
        printArray(arr,size);
        System.out.println();
        System.out.println("After sorting:");
        sort(arr,size);
    }
}


//output
//PS C:\DailyAssignments\Day8> javac Bubblesort.java
//PS C:\DailyAssignments\Day8> java Bubblesort
//Enter array size:3
//Enter array elements:
//108
//205
//12
//Before sorting:
//108 205 12     
//After sorting: 
//12 108 205 

 import java.util.Scanner;
 public class Insertionsort
 {
     public static void printArray(int array[],int size)
     {
         for(int i=0;i<size;i++)
         System.out.print(array[i]+" ");
     }
     public static void sort(int array[])
     {
         int n=array.length;
         for(int j=1; j<n; j++)
         {
             int i=j-1;
             int key=array[j];
             while((i>-1) && (array[i]>key))
             {
                 array[i+1]=array[i];
                 i--;
             }
             array[i+1]=key;
         }
         printArray(array,array.length);
     }
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int n=scan.nextInt();
         int arr[] = new int[n];
         for(int i=0; i<n; i++)
             arr[i]=scan.nextInt();
         scan.close();
         sort(arr);
     }
 }
   
 //output
 //PS C:\DailyAssignments\Day8> java Insertionsort
 //5
 //22
 //66
 //12
 //98
 //44
 //12 22 44 66 98 



import java.util.Scanner;
public class Patterns2 {
    public static void main(String[] args){
   Scanner sc=new Scanner(System.in); 
   int n=sc.nextInt();
   int m=sc.nextInt();
   for(int i=1;i<=n;i++){
     for(int j=1;j<=m;j++){
         if(i==1 || i==n || j==1 ||j==m){
             System.out.print(" * ");
        }
         else{
             System.out.print("   ");
         }
     }
           System.out.println();
   }
      
sc.close();
    }
}




//PS C:\Patterns> javac Patterns2.java
//PS C:\Patterns> java Patterns2
//3
//5
 //*  *  *  *  * 
 //*           * 
 //*  *  *  *  * 
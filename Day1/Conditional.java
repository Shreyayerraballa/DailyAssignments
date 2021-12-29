import java.util.Scanner;

public class Conditional{

 public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
      System.out.println("Enter a number:");
      int num= sc.nextInt();
      sc.close();
       if(num%2==0){
  
       if(num>=6&&num<=20){
             System.out.println("weired");
        }
    

         else{
  
      System.out.println("not weired");
        }
    }
      else{
  
      System.out.println(" weired");
    }
  }
}   
 
    


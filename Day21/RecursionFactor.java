
    import java.util.*;
public class RecursionFactor {
  static int factorial(int n){
      if(n==0) 
           return 1;
      else
           return(n*factorial(n-1));
  } 
  public static void main(String[] args){
      int  fact=1;
      Scanner sc = new Scanner(System.in);
      int number=sc.nextInt();
      fact=factorial(number);
      System.out.println("factorial of "+number+"is : "+fact);
      sc.close();
  } 
}


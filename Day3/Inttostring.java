import java.util.Scanner;
public class Inttostring {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s=Integer.toString(t);

        if(t==Integer.parseInt(s))
        {
            if(t>=-100 && t<=100)
            {
                System.out.println("good job");
            }
            else{
                System.out.println("wrong answer");

            }
        }
         System.out.println("integer converted to string"+s);
         sc.close();
    }
    
}

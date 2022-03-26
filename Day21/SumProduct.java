
    import java.util.*;
public class SumProduct {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        int temp=digit;
        int remainder,sum=0, product=1;
        while(temp!=0){
            remainder=temp%10;
            sum=sum+remainder;
            product=product*remainder;
            temp=temp/10;
        }
        System.out.println("sum of digits : "+sum);
        System.out.println("product of digiths :  "+product);
        sc.close();
    }
}


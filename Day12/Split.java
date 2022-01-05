import java.util.Scanner;
public class Split{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String st="[  :,'&%$#?@!_-]";
        String[] result=str.split(st);
        for(String t:result){
            System.out.println(t);
        }
        System.out.println(result.length);
        sc.close();
    }
}
import java.util.*;
public class Ipv6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String regex="[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";
        if(str.matches(regex)){
            System.out.println("IPV4 is valid");
        }
        else{
            System.out.println("IPV4 is invalid");
        }
        sc.close();

    }
}
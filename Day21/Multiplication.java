  import java.util.*;
public class Multiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int times=sc.nextInt();
        for(int i=1;i<=times;i++){
            int table=num*i;
            System.out.println(num+"*"+i+"="+table);
        }
        sc.close();
        
    }
}


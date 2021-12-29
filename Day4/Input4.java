import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("input data");
        
        for(int i=0;i<3;i++){
            String N=sc.next();
            int B=sc.nextInt();
            sc.close();
            System.out.println(N+"\t"+B);
        }

    }
    
}

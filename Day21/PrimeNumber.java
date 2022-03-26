
    import java.util.*;
    public class PrimeNumber {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter min value");
            int min=sc.nextInt();
            System.out.println("enter max value");
            int max=sc.nextInt();
            int num=0;
            for(int i=min; i<=max; i++) {
               int count=0;
               for(num=i;num>=1;num--){
                   if(i%num==0){
                       count =count+1;
                   }
               }
               if(count==2){
                   System.out.println("prime numbers are " + i);
               }
            }
            
           sc.close();
        }
          
}

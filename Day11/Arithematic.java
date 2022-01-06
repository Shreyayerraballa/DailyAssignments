
    import java.util.Scanner;
    public class Arithematic{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            try{
                
                int result=a/b;
                System.out.println(result);
            }
            catch(Exception e){
                System.out.println(e);
        
            }
            finally{
                System.out.println("finally block is executing");
            }
            sc.close();
        }
    }
      


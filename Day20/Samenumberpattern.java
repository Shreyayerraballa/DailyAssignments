
    import java.util.*;
    public class Samenumberpattern{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<=n;i++){
                for(int j=0;j<i;j++){
                    System.out.print(i +" ");
                }
                System.out.println();
            }
            sc.close();
        }
    }

    /*
    o/p
    PS C:\DailyAssignments\Day20> javac Samenumberpattern.java
PS C:\DailyAssignments\Day20> java Samenumberpattern
12

1
2 2 
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9
10 10 10 10 10 10 10 10 10 10
11 11 11 11 11 11 11 11 11 11 11
12 12 12 12 12 12 12 12 12 12 12 12 
*/
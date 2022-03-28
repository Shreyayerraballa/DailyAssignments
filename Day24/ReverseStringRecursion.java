
    import java.util.*;
public class ReverseStringRecursion{
    void reverseString(String str){
        if((str==null) || (str.length()<=1)){
            System.out.println(str);
        }
        else{
            System.out.print(str.charAt(str.length()-1));
            reverseString(str.substring(0,str.length()-1));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        ReverseStringRecursion rs=new ReverseStringRecursion ();
        rs.reverseString(str);
        sc.close();

    }
    
}

/* o/p
PS C:\DailyAssignments\Day24> javac ReverseStringRecursion.java
PS C:\DailyAssignments\Day24> java ReverseStringRecursion
Ashoka college
egelloc akohsA
*/
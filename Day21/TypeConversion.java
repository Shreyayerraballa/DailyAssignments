
    import java.util.*;
public class TypeConversion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    float f=sc.nextFloat();
    int n=(int)f;
    System.out.println("float is converted into int "+n);
    sc.close();
    }

}

/*
o/p
PS C:\DailyAssignments\Day21> javac TypeConversion.java
PS C:\DailyAssignments\Day21> java TypeConversion
12.3456
float is converted into int 12
*/
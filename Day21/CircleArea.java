
    import java.util.*;
public class CircleArea {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int radius=sc.nextInt();
    double circle=3.14*radius*radius;
    System.out.println("area of circle is : "+ circle);
    sc.close();
    }
}

/*abstractPS C:\DailyAssignments\Day21> javac CircleArea.java
PS C:\DailyAssignments\Day21> java CircleArea
12
area of circle is : 452.15999999999997
*/
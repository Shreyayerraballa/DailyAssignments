import java.util.*;
public class Arrayex {
    public static void main(String[] args){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(2);
        ar.add(12);
        ar.add(44);
        ar.add(18);
        ar.add(19);
        System.out.println("array after adding elements : "+ar);
        ar.remove(2);
        ar.remove(1);
        System.out.println("array after removing elements : "+ar);
        ar.add(2,50);
        System.out.println("after inserting element at a specific position "+ar);
    }
}
/*
o/p
PS C:\DailyAssignments\Day22> javac Arrayex.java
PS C:\DailyAssignments\Day22> java Arrayex
array after adding elements : [2, 12, 44, 18, 19]
array after removing elements : [2, 18, 19]
*/
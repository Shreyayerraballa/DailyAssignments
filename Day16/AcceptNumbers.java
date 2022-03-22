import java.util.*;
public class AcceptNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String regex="(((^[1-3])([0-9]*[A-Za-z]*)){1,10})";
        if(str.matches(regex)){
            System.out.println("string is accepted");
        }
        else{
            System.out.println("not accepted");
        }
        sc.close();
        
    }
}

/*
o/p
PS C:\DailyAssignments\Day16> javac AcceptNumbers.java
PS C:\DailyAssignments\Day16> java AcceptNumbers
1234ab
string is accepted
PS C:\DailyAssignments\Day16> javac AcceptNumbers.java
PS C:\DailyAssignments\Day16> java AcceptNumbers
1a2b3c
not accepted
*/
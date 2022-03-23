import java.util.*;
public class Firstnonrepeatingcharacter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(char i :str.toCharArray()){
            if(str.indexOf(i)==str.lastIndexOf(i)){
                System.out.println("first non repeating character :"+i);
                break;
            }
        }
        sc.close();
    }
    
}

/*
o/p
PS C:\DailyAssignments\Day19> javac Firstnonrepeatingcharacter.java
PS C:\DailyAssignments\Day19> java Firstnonrepeatingcharacter
shreya
first non repeating character :s
*/
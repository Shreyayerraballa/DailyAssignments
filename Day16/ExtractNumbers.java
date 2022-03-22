
    import java.util.*;
import java.util.regex.*;
public class ExtractNumbers {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String regex="([0-9]+)";
    Pattern r=Pattern.compile(regex);
    Matcher m=r.matcher(str);
    System.out.println("numbers in the string are : ");
    while(m.find()){
        System.out.println(m.group()+" ");
    }
    sc.close();
}   
}


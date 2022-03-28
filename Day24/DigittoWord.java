
    import java.util.*;
public class DigittoWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r,num;
        String digitwords="";
        num=n; 
        while(num>0){
            r=num%10;
            switch(r){
                case 0 : 
                       digitwords="zero"+digitwords;
                       break;
                case 1: 
                       digitwords="one"+digitwords;
                       break;
                 case 2: 
                       digitwords="two"+digitwords;
                       break;
                 case 3 : 
                       digitwords="three"+digitwords;
                       break;
                 case 4 : 
                       digitwords="four"+digitwords;
                       break;
                 case 5 : 
                       digitwords="five"+digitwords;
                       break;
                 case 6: 
                       digitwords="six"+digitwords;
                       break;
                 case 7 : 
                       digitwords="seven"+digitwords;
                       break;
                 case 8 : 
                       digitwords="eight"+digitwords;
                       break;
                case 9 : 
                       digitwords="nine"+digitwords;
                       break;
            }
            num=num/10;
        }
        System.out.println(digitwords);
        sc.close();
    }
    
}

/* o/p
PS C:\DailyAssignments\Day24> javac DigittoWord.java
PS C:\DailyAssignments\Day24> java DigittoWord
1053
onezerofivethree
*/
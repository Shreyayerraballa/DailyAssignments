
    import java.util.*;
    public class Id {
        public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String firstname=sc.nextLine().toLowerCase();
    String lastname=sc.nextLine().toLowerCase();
    String largername;
    String smallername;
    int Pin=sc.nextInt();
    int n=sc.nextInt();
    String pin=Integer.toString(Pin);
    if(firstname.length()>lastname.length()){
        largername = firstname;
        smallername=lastname;
    }
    else if(firstname.length()==lastname.length()){
            int compare=  firstname.compareTo(lastname);
              if(compare>0){
               largername=lastname;
               smallername=firstname;
              }
              else{
                  largername=firstname;
                  smallername=lastname;
              }
    }
    else{
        largername=lastname;
        smallername=firstname;
    }
    
    System.out.println(smallername.charAt(smallername.length()-1)+largername+pin.charAt(n-1)+pin.charAt(pin.length()-n));
    sc.close();
        }
    }  

/*
o/p
PS C:\DailyAssignments\Day20> javac Id.java
PS C:\DailyAssignments\Day20> java Id
naveen
kumar
123456
3
rnaveen34
*/
public class Concatenate {
    public static void main(String[] args){
        String str[]={"shreya","kashyap","yerraballa"};
        String str1=new String();
        for(int i=0;i<str.length;i++){
           str1=str1+str[i];
        }
        System.out.println(str1);
    }
}

/*
o/p
PS C:\DailyAssignments\Day21> javac Concatenate.java
PS C:\DailyAssignments\Day21> java Concatenate
shreyakashyapyerraballa
*/
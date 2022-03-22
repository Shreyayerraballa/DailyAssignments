import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class BasicSet{
    public static void main(String[] args){
        final String REGEX_PATTERN="fooa*bar";
        Pattern r=Pattern.compile(REGEX_PATTERN);
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\DailyAssignments\\Day13\\File.txt"));
            String line;
            while((line=br.readLine())!=null){
                Matcher m=r.matcher(line);
                if(m.find())
                System.out.println(line);
            }
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
}

/* PS C:\DailyAssignments\Day13> javac BasicSet.java
PS C:\DailyAssignments\Day13> java BasicSet
fooaaaabar
fooabar 
foobar  
fooaabar*/
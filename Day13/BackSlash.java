import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class BackSlash {
    public static void main(String[] args){
        Pattern r=Pattern.compile("x[#:\\^]y");
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

/*
PS C:\DailyAssignments\Day13> java CharacterClass   
x#y
x:y
x^y
*/
    import java.io.*;
    import java.util.regex.Pattern;
    import java.util.regex.Matcher;
    public class WildCardSymbol{
        public static void main(String[] args){
            Pattern r=Pattern.compile("foo.bar");
            try{
                BufferedReader br=new BufferedReader(new FileReader("C:\\exercise\\Assignments\\Day-13\\File.txt"));
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
    output
    PS C:\DailyAssignments\Day13> java CharacterClass  
    fooabar
    fooxbar
    foocbar
    */  


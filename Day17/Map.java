
    import java.util.ArrayList;

public class Map {
  public static int multiply(int n){
      return n*5;
  }
  public static  int add(int n){
      return n+10;
  }  
  public static void main(String[] args){
      ArrayList<Integer>ar=new ArrayList<Integer>();
      ar.add(1);
      ar.add(2);
      ar.add(3);
      ar.add(4);
      ar.add(5);
      ar.stream().map(Map::multiply).map(Map::add).forEach(System.out::println);

  }
}


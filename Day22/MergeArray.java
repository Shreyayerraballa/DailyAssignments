
    import java.util.*;
    public class MergeArray {
        public static void main(String[] args){
            int[] firstarray={23,66,87,55,34};
            Arrays.sort(firstarray);
            int[] secondarray={33,89,85,44};
            Arrays.sort(secondarray);
            int length=firstarray.length+secondarray.length;
            int[] mergedarray=new int[length];
            int pos=0;
            for(int element : firstarray){
                mergedarray[pos]=element;
                pos++;
            }
            for(int element : secondarray){
                mergedarray[pos]=element;
                pos++;
            }
            System.out.println(Arrays.toString(mergedarray));
        }
        
    }  



    public class LargestSmallest {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("no.of elements");
            int min,max;
            int n=scan.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n; i++){
                System.out.print("enter the elements"+(i-1)+" :");
                arr[i]=scan.nextInt();
            }
            min=arr[0];
            max=arr[0];
            for(int i=0;i<n; i++){
                if(min>arr[i]){
                    min=arr[i];
                }
                if(max<arr[i]){
                    max=arr[i];
                }
            }
            System.out.println("the small val: " +min);
            System.out.println("the large val: " +max);
            scan.close();
        }
        
    }  


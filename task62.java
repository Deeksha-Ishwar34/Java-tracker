public class task62 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6};
        if(arr.length==0){
            System.out.println("Array is empty");
        }
        else if(arr.length==1){
            System.out.println("array is sorted");
        }
        else{
             checking(arr);
        }
       
    }
    public static void checking(int[] arr){
        boolean sorted=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                sorted=true;
        }
            else{
                sorted=false;
                break;
            }
        }
         System.out.println(sorted);
       
    }
}

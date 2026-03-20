public class task65 {
    public static void main(String[] args) {
         int[] arr = {4, 5, 1, 2, 4, 5, 2 };
         if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        else{
             find_unique(arr);
        }
    }
    public static void find_unique(int[] arr){
        
        for (int i = 1; i <=arr.length-1; i++) {
            int count=0;
           for(int j=0;j<=arr.length-1;j++){
            if(arr[i]==arr[j]){
                count++;
            }
           }
           if(count==1){
            System.out.println(arr[i]);
        }
        }
        
       
    }
}

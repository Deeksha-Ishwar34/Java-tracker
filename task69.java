public class task69 {
    public static void main(String[] args) {
        int[] arr= {3,7,1, 9, 4, 6};
         if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        } else {
            count(arr);
        }
    }
    public static void count(int[] arr){
        int target=4;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println("Count:-"+count);
    }
}

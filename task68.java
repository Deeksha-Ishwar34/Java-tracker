public class task68 {
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 6, 5};
         if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        } else {
            sum(arr);
        }
    }
    public static void sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of even numbers ="+sum);

    }
}

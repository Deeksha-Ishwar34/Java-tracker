public class task76 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr);
    }
    public static void reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
           arr[left]=arr[right];
           left++;
           right--;
        }
        for(int num:arr){
            System.out.println(num+" ");
        }
    }
}

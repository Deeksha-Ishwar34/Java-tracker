public class task84 {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        reverse(arr);
    }
    public static void reverse(int[] arr){
        int l=0;
        int r=arr.length-1;
        int temp;
        while(l<r){
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
     for(int x:arr){
        System.out.println(x);
     }
    }
}

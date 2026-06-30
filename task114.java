import java.util.Arrays;
public class task114 {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        movezeros(arr);
    }
    public static void movezeros(int[] arr){
        int slow=0;
        for(int fast=0;fast<arr.length;fast++){
            if(arr[fast]!=0){
                int temp=arr[slow];
                arr[slow]=arr[fast];
                arr[fast]=temp;
                slow++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

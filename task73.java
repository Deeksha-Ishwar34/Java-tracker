import java.util.Arrays;
public class task73 {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        removeduplicate(arr);
    }
    public static void removeduplicate(int[] arr){
        int slow=0;
        for(int fast=1;fast<arr.length;fast++){
            if(arr[slow]!=arr[fast]){
                slow++;
                arr[slow]=arr[fast];
            }
        }
        System.out.println(slow+1);
        System.out.println(Arrays.toString(arr));
        
    }
}

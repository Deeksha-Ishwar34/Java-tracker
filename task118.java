import java.util.Arrays;
public class task118 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4};
        removedupli(arr);
    }
    public static void removedupli(int[] arr){
        for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        } 
        }
        System.out.println(Arrays.toString(arr));
    }
}

import java.util.Arrays;
public class task87 {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        RemoveDupli(arr);
    }
    public static void RemoveDupli(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
            arr[i+1]=arr[j];
            i++;
        }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(i+1);
    }
}

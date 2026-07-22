import java.util.Arrays;
public class task118 {
    public static void main(String[] args) {
        int[] arr={0,1,1,2,2,3};
        removedupli(arr);
    }
    public static void removedupli(int[] arr){   int i=0;
        while(i<arr.length-1){
           for(int j=i;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            } 
        } 
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(i);
        
    }
}

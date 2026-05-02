import java.util.*;
public class task90 {
    public static void main(String[] args) {
        int[] arr={7, -3,1, 4, 8};
        Sorted(arr);
    }
    public static void Sorted(int[] arr){
        int res[]=new int[arr.length];
        int l=0;
        int r=arr.length-1;
        for(int indx=arr.length-1;indx>=0;indx--){
             if(Math.abs(arr[r])>Math.abs(arr[l])){
            res[indx]=Math.abs(arr[r]);
            r--;
        }
        else{
            res[indx]=Math.abs(arr[l]);
            l++;
        }
        }
       System.out.println(Arrays.toString(res));
    }
}

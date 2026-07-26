import java.util.Arrays;

public class task122 {
    public static void main(String[] args) {
         int[] arr={0,1,2,2,3,0,4,2};
         int val=2;
        removeval(arr,val);
    }
    public static void removeval(int[] arr,int val){   
      int[] temp=new int[arr.length];
      int j=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]!=val){
            temp[j]=arr[i];
            j++;
        }
      }
       System.out.println(Arrays.toString(temp));
    }
}

public class task132 {
    public static void main(String[] args) {
         int[] arr={1,2,3,4,5,6,7};
         int k=7;
        rotate(arr,k);
    }
     public static void rotate(int[] arr,int k){
       int[] ans=new int[arr.length];
       int len=0;
       for(int i=arr.length-k;i<arr.length;i++){
        ans[len]=arr[i];
        len++;
       }
        for(int j=0;j<k;j++){
         ans[len]=arr[j];
       }
       
     }
}

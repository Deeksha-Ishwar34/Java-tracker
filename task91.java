public class task91 {
    public static void main(String[] args) {
        int[] arr={2,1,5,1,3,2};
        int k=3;
        MaxSubarr(arr,k);
    }
    public static void MaxSubarr(int[] arr,int k){
        int maxsum=0;
        int winsum=0;
        for(int i=0;i<k;i++){
            winsum+=arr[i];
        }
        maxsum=winsum;
        for(int j=k;j<arr.length;j++){
             winsum-=arr[j-k];
              winsum+=arr[j];
             maxsum=Math.max(maxsum, winsum);
        }
       
        System.out.println(maxsum);
    }
}

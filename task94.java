public class task94 {
    public static void main(String[] args) {
        int[] arr={4,2,1, 7, 8, 1};
        int k=2;
        maxsub(arr,k);
    }
    public static void maxsub(int[] arr,int k){
         int maxsum=0;
        for(int i=0;i<arr.length-1;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            maxsum=Math.max(maxsum,sum);
        }
        System.out.println(maxsum);
    }
}

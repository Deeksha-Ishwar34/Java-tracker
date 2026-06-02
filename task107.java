public class task107 {
    public static void main(String[] args) {
        int[] arr={2, -1, 2, 1};
        int k=4;
        longsub(arr,k);
    }
    public static void longsub(int[] arr,int k){
        int left=0;
        int winsum=0;
        int maxsub=0;
        for(int right=0;right<arr.length;right++){
            winsum+=arr[right];
            while(!(winsum<=k)){
                winsum-=arr[left];
                left++;
            }
            maxsub = Math.max(maxsub, right - left + 1);
        }
        System.out.println(maxsub);
    }
}

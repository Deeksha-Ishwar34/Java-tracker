public class task104 {
        public static void main(String[] args) {
        int[] arr={1,2, 1, 0, 1, 1, 0};
        int k=4;
        longsubarr(arr,k);
    }
    public static void longsubarr(int[] arr,int k){
        int left=0;
        int sum=0;
        int longSub=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            longSub=Math.max(longSub,right-left+1);
        }
        System.out.println(longSub);
    }
}

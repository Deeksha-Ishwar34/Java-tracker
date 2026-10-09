public class task92 {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,1};
        int k=2;
        subarr(arr,k);
    }
    public static void subarr(int[] arr,int k){
        int cur_count=0;
        int maxcount=0;
        for (int i = 0; i < k; i++) {
            if(arr[i]==1){
                cur_count++;
            }
        }
        maxcount=cur_count;
        for(int j=k;j<arr.length;j++){
            if(arr[j]==1){
                cur_count++;
            }
            if(arr[j-k]==1){
                cur_count--;
            }
            maxcount=Math.max(maxcount, cur_count);
        }
        System.out.println(maxcount);
    }
}

public class task93 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=3;
        subsum(arr,k);
    }
    public static void subsum(int[] arr, int k){
        int winsum=0;
        for(int i=0;i<k;i++){
            winsum+=arr[i];
        }
        System.out.println(winsum);
        for(int j=k;j<arr.length;j++){
            winsum+=arr[j];
            winsum-=arr[j-k];
            System.out.println(winsum);
        }
        
        
        
    }
}

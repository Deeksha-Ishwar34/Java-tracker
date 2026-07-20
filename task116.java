public class task116 {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        twosum(arr,target);
    }
    public static void twosum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
            int needed=target-arr[i];
            if(arr[j]==needed){
                System.out.printf("[%d,%d]",i,j);
            }
        }
        }
    }
}

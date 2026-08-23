public class task70 {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        twosum(arr,target);
    }
    public static void twosum(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]+arr[right]==target){
                System.out.printf("%d and %d",left,right);
                return;
            }
            else if(arr[left]+arr[right]>target){
                right--;
            }
            else if(arr[left]+arr[right]<target){
                left++;
            }
        }
    } 
}

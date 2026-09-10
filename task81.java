public class task81 {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        twoSum(arr,target);
    }
    public static void twoSum(int[] arr,int target){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==target){
                System.out.printf("[%d,%d]",l+1,r+1);
                break;
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }   
    }
}

public class task80 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4};
        int target = 5;
        uni(arr, target);
    }
    public static void uni(int[] arr,int target){
    int left = 0;
    int right = arr.length - 1;
    while(left < right){
        int sum=arr[left]+arr[right];
        if(sum==target){
            System.out.printf("(%d %d)",arr[left],arr[right]);
            left++;
            right--;
        }
        else if(sum<target ){
            left++;
        }
        else{
            right--;
        }
    }




    }
}

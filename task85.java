public class task85 {
    public static void main(String[] args) {
        int[] arr={1,3,5,7, 9};
        int target=12;
        pair(arr,target);
    }
    public static void pair(int[] arr,int target){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==target){
                System.out.printf("%d,%d",arr[l],arr[r]);
                l++;
                r--;
            }
            else if(sum>target){
                r--;
            }
            else{
                l++;
            }
            
        }
    }
}

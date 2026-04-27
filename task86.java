public class task86 {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        int target=9;
        pair(arr,target);
    }
    public static void pair(int[] arr,int target){
        int l=0;
        int r=arr.length-1;
        for(int m=1;m<arr.length;m++){
            int sum=arr[l]+arr[r]+arr[m];
            if(sum==target){
                System.out.printf("%d,%d,%d",arr[l],arr[m],arr[r]);
                l++;
                r--;
            }
            else if(sum>target){
                r--;
            }
            else{
                l++;
                r--;
            }
            
        }
    }
}

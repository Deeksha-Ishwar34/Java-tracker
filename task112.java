public class task112 {
    public static void main(String[] args) {
        int[] arr={0,1,1,1,1,1,0,0,0};
        longContiArr(arr);
    }
    public static void longContiArr(int[] arr){
        int maxcount=0;
        for(int i=0;i<arr.length;i++){
            int zerocount=0;
            int onecount=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==0){
                    zerocount++;
                }
                else{
                    onecount++;
                }
                if (zerocount==onecount){
                    maxcount=Math.max(maxcount,j-i+1);
                }
            }
        }
        System.out.println(maxcount);
    }
}

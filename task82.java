public class task82 {
    public static void main(String[] args) {
        int[] arr1={-4, -1, 0, 3, 10};
        int[] arr2={3, -1, 0, 3, 10};
        check(arr1,arr2);
    }
    public static void check(int[] arr1,int[] arr2){
       
        for(int i=0;i<arr1.length;i++){
             if(arr1[i]!=arr2[i]){
            System.out.println("Not equal");
            return;
        }
        }
       System.out.println("Equal");
    }
}

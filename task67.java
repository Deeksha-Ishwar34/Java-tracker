public class task67 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,3,3};
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        } else {
            calcFreq(arr);
        }
    }
    public static void calcFreq(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.printf("%d appears %d times", arr[i], count);   
           
            System.out.println();
        }
    }
}

public class task86 {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4, 5};
        int target = 9;
        pair(arr, target);
    }
    public static void pair(int[] arr, int target) {
        for (int l = 0; l < arr.length - 2; l++) {
            int m = l + 1;
            int r = arr.length - 1;

            while (m < r) {
                int sum = arr[l] + arr[m] + arr[r];

                if (sum == target) {
                    System.out.printf("%d,%d,%d\n", arr[l], arr[m], arr[r]);
                    m++;
                    r--;
                } 
                else if (sum > target) {
                    r--;
                } 
                else {
                    m++;
                }
            }
        }
    }
}
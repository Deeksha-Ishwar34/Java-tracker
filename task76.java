public class task76 {
    public static void main(String[] args) {
        int[] arr = { 11, 52, 73, 4,67,58 };
        reverse(arr);
    }
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}

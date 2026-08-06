public class task62 {
    public static void main(String[] args) {
        int[] arr = { 1, 21, 5, 6 };
        if (arr.length == 0) {
            System.out.println("Array is empty");
        } else if (arr.length == 1) {
            System.out.println("array is sorted");
        } else {
            checking(arr);
        }
    }
    public static void checking(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}

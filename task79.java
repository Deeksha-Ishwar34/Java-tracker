public class task79 {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 0, 0, 4, 12 };
        move(arr);
    }

    public static void move(int[] arr) {
        int slow = 0;
        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] != 0) {
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++;
            }
        }
        for (int num : arr) {
                System.out.println(num + "");
            }
    }
}

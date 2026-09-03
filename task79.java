public class task79 {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 0, 0, 4, 12 };
        move(arr);
    }
    public static void move(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        for (int num : arr) {
                System.out.println(num + "");
            }
    }
}

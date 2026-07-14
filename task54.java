public class task54 {
    public static void main(String[] args) {
        int[] arr = { 15, 83, 8, 1, 9, 2 };
        int first_largest = arr[0];
        int sec_largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first_largest) {
                first_largest = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == first_largest) {
                continue;
            } else if (sec_largest < arr[i]) {
                sec_largest = arr[i];
            }
        }
        System.out.println(sec_largest);

    }

}

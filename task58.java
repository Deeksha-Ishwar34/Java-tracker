public class task58 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 1, 3, 4, 9, 6, 6 };
        freq(arr);
    }
    public static void freq(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (visited[i] == true) {
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.printf("%d appears %d times\n", arr[i], count);
        }
    }
}

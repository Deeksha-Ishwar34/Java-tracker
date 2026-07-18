public class task57 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 6, 4, 9 };
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        } 
            smallLarge(arr);
        
    }

    public static void smallLarge(int[] arr) {
        int small = arr[0];
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            } else if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println(small);
        System.out.println(large);
    }
}

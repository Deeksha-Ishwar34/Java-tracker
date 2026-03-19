public class task64 {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 7, 9, 1, 67, 54 };
        if (arr.length == 0) {
            System.out.println("Arrayt is empty");
        }
        even_odd_check(arr);
    }

    public static void even_odd_check(int[] arr) {
        int even=0;
        int odd=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even count");
    }
}

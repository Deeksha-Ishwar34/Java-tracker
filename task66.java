public class task66 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        } else {
            calcSum_Avg(arr);
        }
    }
    public static void calcSum_Avg(int[] arr) {
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = (double) sum / arr.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}

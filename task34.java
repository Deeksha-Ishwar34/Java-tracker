import java.util.Scanner;
public class task34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = getN(sc);
        int[] numbers = getNums(sc, n);
        int total = getTotal(numbers);
        getAvg(total, numbers);
        getevenodd(numbers);
        sc.close();
    }

    public static int getN(Scanner sc) {
        System.out.println("Enter size of an array ");
        return sc.nextInt();
    }

    public static int[] getNums(Scanner sc, int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1));
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

    public static int getTotal(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.println("Total: " + total);
        return total;
    }

    public static void getAvg(int total, int[] numbers) {
        int length = numbers.length;
        double avg = total / length;
        System.out.println("Average: " + avg);
    }

    public static void getevenodd(int[] numbers) {
        int even = 0;
        int odd = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even" + even);
        System.out.println("Odd" + odd);
    }
}

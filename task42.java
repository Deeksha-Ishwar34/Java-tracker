import java.util.ArrayList;
import java.util.Scanner;

public class task42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = getN(sc);
        ArrayList<Integer> list = getMarks(sc, n);
        display(list);
        findhighest(list);
        calcavg(list);
        removeFailed(list);
        sc.close();
    }

    public static int getN(Scanner sc) {
        System.out.println("Enter number of students: ");
        return sc.nextInt();
    }

    public static ArrayList<Integer> getMarks(Scanner sc, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter mark " + (i + 1));
            list.add(sc.nextInt());
        }
        return list;
    }

    public static void display(ArrayList<Integer> list) {
        for (int num : list) {
            System.out.println(num);
        }
    }

    public static void findhighest(ArrayList<Integer> list) {
        int highest = list.get(0);
        for (int num : list) {
            if (num > highest) {
                highest = num;
            }
        }
        System.out.println("Highest: " + highest);
    }

    public static void calcavg(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        double Average = sum / (double) list.size();
        System.out.println("Average: " + Average);
    }

    public static void removeFailed(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= 35) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("After removing failed students:");
        System.out.println("Marks" + list);
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        double Average = sum / (double) list.size();
        System.out.println("Average: " + Average);
    }

}

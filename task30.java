import java.util.Scanner;
public class task30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units=getUnits(sc);
        int bill=calcbill(units);
        System.out.println("Total bill:- "+bill);
    }
    public static int getUnits(Scanner sc) {
        System.out.println("Enter Units:- ");
        return sc.nextInt();
    }
    public static int calcbill(int units)
{
    if (units < 0) {
        return -1;
    }
    else if (units <= 100) {
        return units * 1;
    }
    else if (units <= 200) {
        return (100 * 1) + ((units - 100) * 2);
    }
    else {
        return (100 * 1) + (100 * 2) + ((units - 200) * 3);
    }
}   
    }


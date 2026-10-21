import java.util.Scanner;
public class task98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Birth Year:- ");
        int byear=sc.nextInt();
       int curyear=2026;
       int age=curyear-byear;
       int ageInMonths=age*12;
       int ageInDays=age*365;
       System.out.printf("age:- %d,age in months:- %d,age in days:- %d",age,ageInMonths,ageInDays); 
       sc.close();
    }
}

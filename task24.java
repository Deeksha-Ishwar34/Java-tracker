import java.util.Scanner;
public class task24 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=getName(sc);
        int basic_salary=getBasicSalary(sc);
        int hra=calcHra(basic_salary);
        int da=calcDa(basic_salary);
        int gross_salary=calcGrossSalary(basic_salary,hra,da);
        System.out.printf("----- SALARY SLIP -----\nName:%s\nBasic Salary:%.2f\nHRA:%.2f\nDA:%.2f\nGross salary:%.2f\n----------------------",name,basic_salary,hra,da,gross_salary);
        sc.close();
      }
      public static String getName(Scanner sc){
             System.out.println("Enter name:");
            return sc.nextLine();
      }
      public static int getBasicSalary(Scanner sc){
        System.out.println("Enter basic salary: ");
        return sc.nextInt();
      }
      public static int calcHra(int s){
            return (20/100)*s;
      }
      public static int calcDa(int s){
            return (50/100)*s;
      }
      public static int calcGrossSalary(int basic_salary,int hra,int da){
            return basic_salary+hra+da;
      }
}

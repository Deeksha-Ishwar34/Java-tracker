import java.util.Scanner;
public class task28 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int principal=getPrincipal(sc);
            int rate=getRate(sc);
            int time=getTime(sc);
            int simple_interest=getSI(principal,rate,time);
            display(simple_interest);
            sc.close();
    }
    public static int getPrincipal(Scanner sc){
        System.out.println("Enter Principal: ");
        return sc.nextInt();
    }
    public static int getRate(Scanner sc){
        System.out.println("Enter Rate: ");
        return sc.nextInt();
    }
    public static int getTime(Scanner sc){
        System.out.println("Enter Time: ");
        return sc.nextInt();
    }
    public static int getSI(int principal,int rate,int time){
        return principal*time*rate/100;
    }
    public static void display(int SI){
        System.out.println("Simple Interest :- "+SI);
    }
}

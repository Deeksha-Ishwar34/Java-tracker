import java.util.ArrayList;
import java.util.Scanner;
public class task41 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        int n = getSize(sc);
        sc.nextLine();  

        getNames(n, sc, names);
        displayNames(names);
        findLongestName(names);

        sc.close();
    }
    public static int getSize(Scanner sc){
        System.out.print("How many names:- ");
        return sc.nextInt();
    }
    public static void getNames(int n, Scanner sc, ArrayList<String> names){
        for(int i = 0; i < n; i++){
            System.out.print("Enter name " + (i+1) + ": ");
            String name = sc.nextLine();
            names.add(name);
        }
    }
    public static void displayNames(ArrayList<String> names){
        System.out.println("\nNames: " + names);
        System.out.println("Total names: " + names.size());
    }
    public static void findLongestName(ArrayList<String> names){
        String longest = names.get(0);

        for(String name : names){
            if(name.length() > longest.length()){
                longest = name;
            }
        }
        System.out.println("Longest name: " + longest);
    }
}

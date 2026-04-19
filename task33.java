import java.util.Scanner;
public class task33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user_name=getusername(sc);
        int password=getpassword(sc);
        CheckUserName_Password(user_name,password);
     sc.close();  
    }
    public static String getusername(Scanner sc){
        System.out.println("Enter username ");
        return sc.nextLine();
    } 
     public static int getpassword(Scanner sc){
        System.out.println("Enter Password ");
        return sc.nextInt();
    } 
    public static void CheckUserName_Password(String user_name,int password){
       boolean a=user_name.equals("user");
        if(!a){
            System.out.println("Invalid user name");
        }
        if(password!=1234){
            System.out.println("Wrong password");
        }
       else{
        System.out.println("Login successful");
       }
    }
}

public class task144 {
    public static void main(String[] args) {
        
    }
    class Bank{
        private String accholder;
        private int accnum;
        private double balance;
        public String getaccholder(){
            return accholder;
        }
        public int getaccnum(){
            return accnum;
        }
        public double getbalance(){
            return balance;
        }
        public void setbalance(double balance){
            this.balance=balance;
        }
        public void displaydetails(){
            System.out.println("Account holder:- "+ accholder);
            System.out.println("Account number:- "+ accnum);
            System.out.println("Balance:- "+ balance);
        }
    }
}

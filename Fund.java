package practice2;
public class Fund {
    public static void main(String[] args) {
        double balance = 10000.00;

        // Manually assigned values
        String beneficiary = "Rahul";
        double amount = 2500.00;
        String type = "IMPS";

        System.out.println("Your account balance is Rs. " + balance);

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        System.out.println("Transferring Rs. " + amount + " to " + beneficiary + " via " + type);
        balance -= amount;
        System.out.println("Transfer successful. Remaining balance: Rs. " + balance);
    }
}


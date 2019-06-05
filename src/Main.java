public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("USAA Savings Bank");

        bank.addBranch("Knoxville");

        bank.addCustomer("Knoxville","Cody", 300.00);
        bank.addCustomer("Knoxville", "James", 1500.00);
        bank.addCustomer("Knoxville", "Scarlett", 300.00);

        bank.addBranch("Reno");

        bank.addCustomer("Reno", "Bob", 1700.00);

        bank.addCustomerTransaction("Knoxville", "Cody", 306.00);
        bank.addCustomerTransaction("Knoxville", "James", -300.00);
        bank.addCustomerTransaction("Reno", "Bob", 300.05);

        bank.listCustomers("Knoxville", false);
        bank.listCustomers("Knoxville", true);

        bank.listCustomers("Reno", true);

        bank.addBranch("Las Vegas");

        if(!bank.addCustomer("Las Vegas", "Brian", 300.00)) {
            System.out.println("Error Las Vegas branch does not exist.");
        }

    }
}

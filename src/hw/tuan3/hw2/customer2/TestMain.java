package hw.tuan3.hw2.customer2;

public class TestMain {

    public static void main(String[] args) {

        Customer customer = new Customer(55, "Nagi", 'm');
        System.out.println(customer);

        System.out.println("id is: " + customer.getId());
        System.out.println("name is: " + customer.getName());
        System.out.println("gender is: " + customer.getGender());

        Account account = new Account(123, customer);
        System.out.println(account);

        account.setBalance(100.99);
        System.out.println(account);
        System.out.println("id is: " + account.getId());
        System.out.println("customer is: " + account.getCustomer());
        System.out.printf("balance: %.2f%n", account.getBalance());
        System.out.println("customer's name is: " + account.getCustomerName());

        account.deposit(50.0);
        account.withdraw(50.0);
        account.withdraw(200.0);
        System.out.println(account);
    }
}

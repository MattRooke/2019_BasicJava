package week7.debugging;

// A customer's purchase is approved if the
// purchase does not exceed the credit limit
public class FixDebugTen4 {
    public static void main(String[] args) {
        int id = 12241;
        String name = "Franklin";
        double credit = 1000.00;
        double purchase = 1325.77;
        DebugCustomer customer = new DebugCustomer(id, name, credit);
        customer.display();
        DebugCustomerMakingPurchase cust = new DebugCustomerMakingPurchase(id, name, credit, purchase);
        cust.display();
    }
}
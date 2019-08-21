package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillingTest {

    @Test
    void computeBill1() {
        Billing bill = new Billing();
        bill.computeBill(30.00);
        assertEquals(32.4, bill.cost);
    }

    @Test
    void computeBill2() {
        Billing bill = new Billing();
        bill.computeBill(30.00, 5);
        assertEquals(162.00, bill.cost);
    }

    @Test
    void computeBill3() {
        Billing bill = new Billing();
        bill.computeBill(30.00, 5, 10.00);
        assertEquals(151.20, bill.cost);
    }
}
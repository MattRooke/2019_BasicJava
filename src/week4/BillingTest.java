package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillingTest {

    @Test
    void computeBill() {
        Billing bill = new Billing(30.00);
        bill.computeBill(30.00);
        assertEquals(32.4, bill.price);
    }
}
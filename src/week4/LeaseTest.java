package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeaseTest {
    Lease lease = new Lease("Matthew Rooke", 11, 199.99, 12);

    @Test
    void addPetFee() {
        Lease petLease = new Lease("Matthew Rooke", 11, 100, 12);
        petLease.addPetFee();
        assertEquals(110, petLease.getRentAmount());
    }

    @Test
    void getTenantName() {
        assertEquals("Matthew Rooke", lease.getTenantName());
    }

    @Test
    void getAptNum() {
        assertEquals(11, lease.getAptNum());
    }

    @Test
    void getRentAmount() {
        assertEquals(199.99, lease.getRentAmount());
    }

    @Test
    void getLeaseTermMonths() {
        assertEquals(12, lease.getLeaseTermMonths());
    }
}
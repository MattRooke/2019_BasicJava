package week4;

public class Lease {
    private String tenantName;
    private int aptNum;
    private double rentAmount;
    private int leaseTermMonths;

    public Lease(String tenantName, int aptNum, double rentAmount, int leaseTermMonths) {
        this.tenantName = tenantName;
        this.aptNum = aptNum;
        this.rentAmount = rentAmount;
        this.leaseTermMonths = leaseTermMonths;
    }

    private static void explainPetPolicy() {
        System.out.println("Having a Pet adds a fee of $10.00 per month.");
    }

    public void addPetFee() {
        rentAmount = rentAmount + 10;
        explainPetPolicy();
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public int getAptNum() {
        return aptNum;
    }

    public void setAptNum(int aptNum) {
        this.aptNum = aptNum;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public int getLeaseTermMonths() {
        return leaseTermMonths;
    }

    public void setLeaseTermMonths(int leaseTermMonths) {
        this.leaseTermMonths = leaseTermMonths;
    }
}

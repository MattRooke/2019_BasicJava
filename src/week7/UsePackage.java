package week7;

public class UsePackage {
    public static void main(String[] args) {
        //UNINSURED
        //Small
        Package smallPackage = new Package(2, 'M');
        System.out.println(smallPackage.display());
        //Medium
        Package medPackage = new Package(12, 'A');
        System.out.println(medPackage.display());
        //Large
        Package largePackage = new Package(25, 'T');
        System.out.println(largePackage.display());

        //INSURED
        //Small
        InsuredPackage smallPackageInsured = new InsuredPackage(8, 'M');
        System.out.println(smallPackageInsured.display());
        //Medium
        InsuredPackage medPackageInsured = new InsuredPackage(9, 'A');
        System.out.println(medPackageInsured.display());
        //Large
        InsuredPackage largePackageInsured = new InsuredPackage(17, 'T');
        System.out.println(largePackageInsured.display());
    }
}

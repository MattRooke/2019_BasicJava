package week8;

public class UseDivision {
    public static void main(String[] args) {

        Division[] JCU = {new DomesticDivision("Cairns", "00001", "QLD"),
                new DomesticDivision("Brisbane", "00002", "QLD"),
                new InternationalDivision("Singapore", "00003", "Singapore", "English")};

        System.out.println("JCU");
        for (Division division : JCU
        ) {
            System.out.println(division);
        }

        Division[] Google = {new DomesticDivision("Mountain View", "94043", "CA"),
                new InternationalDivision("Munich", "80636", "Germany", "German"),
                new InternationalDivision("Zurich", "80024", "Switzerland", "French")};

        System.out.println("Google");
        for (Division division : Google
        ) {
            System.out.println(division);
        }
    }

}

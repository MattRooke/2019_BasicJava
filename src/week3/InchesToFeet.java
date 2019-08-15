package week3;

public class InchesToFeet {
    public static final int CONVERSION = 12;
    int inputInches;
    int outputInches;
    int roundInches;
    int outputFeet;

    public static void main(String[] args) {
        InchesToFeet convert = new InchesToFeet();
        convert.inputInches = 86;
        convert.convertInput(convert.inputInches);
        System.out.println(convert.inputInches + " inches");
        System.out.println(convert.outputFeet + " feet and " + convert.outputInches + " inches");
    }

    void convertInput(int input) {
        outputInches = input % CONVERSION;
        roundInches = inputInches - outputInches;
        outputFeet = roundInches / CONVERSION;

    }
}

package week8;

public class DemoPhoneCalls {
    public static void main(String[] args) {
        //Demo for incoming call:
        IncomingPhoneCall receivedCall = new IncomingPhoneCall("0411878649");
        System.out.println(receivedCall.toString());
        System.out.println();

        //Demo for outgoing call:
        OutgoingPhoneCall madeCall = new OutgoingPhoneCall("0499456987", 3);
        System.out.println(madeCall.toString());
        System.out.println();

        //Demo for getPhoneNumber:
        System.out.println("Phone number for received Call: " + receivedCall.getPhoneNumber());
        System.out.println();

        //Demo for getCost:
        System.out.println("Cost of received call: $" + receivedCall.getCost());
    }
}

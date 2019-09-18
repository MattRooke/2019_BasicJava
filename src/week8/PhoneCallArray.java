package week8;

public class PhoneCallArray {
    public static void main(String[] args) {

        PhoneCall[] calls = new PhoneCall[10];
        calls[0] = new IncomingPhoneCall("+61-455-558-108");
        calls[8] = new IncomingPhoneCall("+61-455-511-988");
        calls[1] = new IncomingPhoneCall("+61-455-565-504");
        calls[2] = new IncomingPhoneCall("+61-455-554-943");
        calls[9] = new IncomingPhoneCall("+61-455-563-723");
        calls[7] = new OutgoingPhoneCall("+61-455-557-884", 6);
        calls[6] = new OutgoingPhoneCall("+61-455-525-569", 8);
        calls[4] = new OutgoingPhoneCall("+61-455-591-038", 2);
        calls[5] = new OutgoingPhoneCall("+61-455-540-443", 13);
        calls[3] = new OutgoingPhoneCall("+61-455-527-244", 20);

        for (PhoneCall call : calls
        ) {
            System.out.println(call.toString());
        }
    }

}

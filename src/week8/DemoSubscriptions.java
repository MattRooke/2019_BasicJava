package week8;

public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription sub1 = new PhysicalNewspaperSubscription("John Smith", "11 Fake St");
        PhysicalNewspaperSubscription sub2 = new PhysicalNewspaperSubscription("Adam Jones", "Real Rd");
        System.out.println(sub1);
        System.out.println(sub2);

        OnlineNewspaperSubscription sub3 = new OnlineNewspaperSubscription("Aj Samual", "Aj@hotmail.com");
        OnlineNewspaperSubscription sub4 = new OnlineNewspaperSubscription("Jess Alexson", "JAlex#gmail.com");
        System.out.println(sub3);
        System.out.println(sub4);
    }
}

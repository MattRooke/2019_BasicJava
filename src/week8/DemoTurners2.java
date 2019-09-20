package week8;

public class DemoTurners2 {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake pancake = new Pancake();

        Wheel wheel = new Wheel();
        ElectronicBillboad billboard = new ElectronicBillboad();

        leaf.turn();
        page.turn();
        pancake.turn();

        wheel.turn();
        billboard.turn();
    }
}

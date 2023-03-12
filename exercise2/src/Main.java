public class Main {
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from stack1: " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2: " + ts.pop2());
    }
}
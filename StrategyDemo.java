public class StrategyDemo {
    public static void main(String[] args) {
        Context add = new Context(new OperationAdd());
        System.out.println(add.executeStrategy(5, 4));

        Context subtract = new Context(new OperationSubtract());
        System.out.println(subtract.executeStrategy(5, 4));

        Context multiply = new Context(new OperationMultiply());
        System.out.println(multiply.executeStrategy(5, 4));
    }
}

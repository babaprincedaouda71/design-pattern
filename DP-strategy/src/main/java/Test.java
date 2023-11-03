import context.Context;
import strategy.Strategy;
import strategy.StrategyImpl1;
import strategy.StrategyImpl2;
import strategy.StrategyImpl3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        Context context = new Context();
        while (true){
            System.out.print("What Strategy? : ");
            String strategyClassName = scanner.nextLine();
            Strategy strategy = (Strategy) Class.forName(strategyClassName).getConstructor().newInstance();
            context.setStrategy(strategy);
            context.applyStrategy();
        }
    }
}

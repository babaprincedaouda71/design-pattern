package obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history = new ArrayList<>();
    @Override
    public void update(int state) {
        System.out.println("---------- Obs2 -------------");
        history.add(state);
        double sum = 0;
        for (Integer s : history){
            sum += s;
        }
        System.out.println("State AVG ==> " + sum/history.size());
        System.out.println("-----------------------");
    }
}

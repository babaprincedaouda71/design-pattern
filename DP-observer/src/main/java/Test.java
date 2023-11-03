import obs.ObservableImpl;
import obs.Observer;
import obs.ObserverImpl1;
import obs.ObserverImpl2;

public class Test {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        observable.setState(90);
        observable.setState(30);

        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();

        observable.subscribe(observer1);
        observable.subscribe(observer2);

        observable.setState(70);
        observable.setState(50);
        observable.setState(60);

        observable.unsubscribe(observer1);
        System.out.println("________________________");

        observable.setState(44);
        observable.setState(34);

        observable.subscribe(new Observer() {
            @Override
            public void update(int state) {
                System.out.println("======================");
                System.out.println("Prévision = " + Math.cos(state * 2.6));
                System.out.println("======================");
            }
        });

        observable.subscribe(state -> {
            System.out.println("======================");
            System.out.println("Tendance = " + ((state > 50) ? "Positif" : "Négatif"));
            System.out.println("========.........=======");
        });

        observable.setState(65);
        observable.setState(44);
    }
}

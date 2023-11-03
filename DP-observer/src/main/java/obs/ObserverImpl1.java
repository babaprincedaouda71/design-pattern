package obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(int state) {
        System.out.println("******** Obs1 ********");
        System.out.println("State value : " + state);
        System.out.println("*****************");
    }
}

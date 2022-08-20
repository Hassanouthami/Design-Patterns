import Singleton.SingletonInstance;

public class Main {
    public static void main(String[] args) {
        SingletonInstance instance = SingletonInstance.getInstance();
        instance.doAction();
        instance.setText("is the same instance and same attributes it just change text");
        instance.doAction();

    }
}
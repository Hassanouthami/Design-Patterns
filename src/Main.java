import Factory.ObjectFactory;
import Factory.ObjectI;
import Singleton.SingletonInstance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton pattern\n");
        SingletonInstance instance = SingletonInstance.getInstance();
        instance.doAction();
        instance.setText("is the same instance and same attributes it just change text");
        instance.doAction();

        System.out.println("Factory Pattern\n");
        ObjectI object1 = ObjectFactory.getObject("object1");
        object1.action();
        ObjectI object2 = ObjectFactory.getObject("object1");
        object2.action();


    }
}
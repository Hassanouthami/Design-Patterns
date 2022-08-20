package Singleton;

public class SingletonInstance {
    private String text;
    private static SingletonInstance instance = new SingletonInstance("Hello World!");

    private SingletonInstance(String s){
        text =  s;
    };

    public void doAction(){
        System.out.println(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public static void setInstance(SingletonInstance instance) {
        SingletonInstance.instance = instance;
    }
    public static SingletonInstance getInstance() {
        return instance;
    }
}

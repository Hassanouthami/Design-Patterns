package Abstract_Factory;

public class AF_main {
    public static void run(){
        System.out.println("Abstartct Factory Pattern\n");
        AbstractObject factoryObject = Factory.getFactory(true);
        AObjectI object1 = factoryObject.getObject("object1");
        object1.action();
        AObjectI object2 = factoryObject.getObject("object2");
        object2.action();
        AbstractObject anotherFactoryObject = Factory.getFactory(false);
        AObjectI object3 = anotherFactoryObject.getObject("object3");
        object3.action();
        AObjectI object4 = anotherFactoryObject.getObject("object4");
        object4.action();
        try{
            AObjectI objectTest3 = factoryObject.getObject("object3");
            objectTest3.action();}
        catch (Exception e){
            System.out.println("There is not any action with null\n");
        }
    }
}

package Factory;

public class ObjectFactory {
    public static ObjectI getObject(String objectType){
        if(objectType == null){
            return null;
        }
        if(objectType.equalsIgnoreCase("object1")){
            return new Object1();
        } else if (objectType.equalsIgnoreCase("object2")) {
            return new Object2();
        }
        else {
            return new Object3();
        }
    }
}

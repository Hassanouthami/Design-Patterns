package Abstract_Factory;


public class ObjectFactory extends AbstractObject {

    @Override
    public AObjectI getObject(String objectType){
        if(objectType.equalsIgnoreCase("object1")){
            return new Object1();
        } else if (objectType.equalsIgnoreCase("object2")) {
            return new Object2();
        }
        else if(objectType.equalsIgnoreCase("object23")) {
            return new Object3();
        }
        return null;
    }
}

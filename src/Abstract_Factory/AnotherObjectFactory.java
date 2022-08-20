package Abstract_Factory;

public class AnotherObjectFactory extends AbstractObject{
    @Override
    public AObjectI getObject(String objectType){
        System.out.println("test"+objectType);
        if(objectType.equalsIgnoreCase("object3")){
            return new Object3();
        }
        else if(objectType.equalsIgnoreCase("object4")) {
            return new Object4();
        }
        return null;
    }
}

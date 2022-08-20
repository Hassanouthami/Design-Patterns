package Abstract_Factory;

public class Factory {
    public static  AbstractObject getFactory(boolean root){
        if(root){
            return new ObjectFactory();
        }
        else{
        return new AnotherObjectFactory();}
    }
}

public class singleton_class {
    private singleton_class(){

    }

    private static singleton_class instance;

    public static singleton_class getInstance(){
        if(instance==null){
            instance=new singleton_class();
        }
        return instance;
    }
}

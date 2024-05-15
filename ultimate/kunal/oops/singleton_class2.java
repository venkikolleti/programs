public class singleton_class2 {
    public static void main(String[] args) {
        //singleton_class obj=new singleton_class();// it shows error because we cant create object like this directly becauese constructor is private

        singleton_class obj2=singleton_class.getInstance();
        singleton_class obj3=singleton_class.getInstance();
        singleton_class obj4=singleton_class.getInstance();

        if(obj2==obj3 && obj2==obj4){
            System.out.println("Both are same");
        }

    }
}

public class method_overloading_validate {

    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");

    }
    static boolean validate(int age){
        return age>=6 && age<19?true:false;

    }

    public static void main(String args[]){
        System.out.println(validate("venkaiah kolleti"));
        System.out.println(validate("venkaiah@kolleti"));

        System.out.println(validate(8));
        System.out.println(validate(89));


    }
}

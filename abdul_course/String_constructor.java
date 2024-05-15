public class String_constructor {
    public static void main(String args[]){
        String str="java";
        System.out.println(str);

        char c[]={'h','e','l','l','o'};
        String str1=new String(c);
        String str2=new String(c,1,3);

        
        System.out.println(str1);
        System.out.println(str2);




        byte b[]={65,66,67,68};
        String str3=new String(b);
        String str4=new String(b,2,2);

        System.out.println(str3);
        System.out.println(str4);





        String str5="java";
        String str6="java";
        String str7="Java";

        String str8=new String("java");

        System.out.println(str5==str6);
        System.out.println(str6==str7);
        System.out.println(str5==str8);


        

        









    }
}

public class string_methods {
    public static void main(String args[]){
        String str="java";



        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());



        String str1="    welcome     ";
        System.out.println(str1+"java");
        str1=str1.trim();
        System.out.println(str1);



        String str2="welcome";

        System.out.println(str2.substring(3));
        System.out.println(str2.substring(3,6));

        
        str2=str2.replace('e','k');

        System.out.println(str2);








        String str3="www.youtube.com";
        System.out.println(str3.startsWith("www"));
        System.out.println(str3.startsWith("ou",5));
        System.out.println(str3.startsWith("www",4));

        System.out.println(str3.endsWith("com"));
        System.out.println(str3.endsWith("www"));



        System.out.println(str3.indexOf("y"));
        System.out.println(str3.indexOf("yo"));
        System.out.println(str3.indexOf(".",4));

        System.out.println(str3.indexOf("?"));


        System.out.println(str3.lastIndexOf("."));
        System.out.println(str3.lastIndexOf(".",7));


        System.out.println(str3.charAt(5));
        





        String str4="java";
        String str5="java";
        String str6="JAVA";
        String str7="python";

        System.out.println(str4.equals(str5));
        System.out.println(str4.equals(str5));

        System.out.println(str4.equals(str6));

        System.out.println(str4.equalsIgnoreCase(str6));


        System.out.println(str4.compareTo(str7));
        System.out.println(str7.compareTo(str4));





        String str8=new String("java");

        System.out.println(str4.equals(str5));
        System.out.println(str4==str5);

        System.out.println(str4.equals(str8));
        System.out.println(str4==str8);








        





        




        





    }
}

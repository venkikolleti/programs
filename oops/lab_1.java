import java.util.Scanner;

class lab_1 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        double a=input.nextDouble();
        double b=input.nextDouble();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        if(a>b){
            System.out.println(a+ " is greater");
        }
        else{
            a++;
            b--;
        }

        double m=a<b?a:b;
        System.out.println("this is conditional operater: "+m);

        if(a>5 && b<10){
            System.out.println("this is logical");
        }
        

        
        

        int num=0;

        System.out.print("Enter a character :");
        char c=input.next().charAt(0);
        
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("given character is vowel");
                num=1;
                break;
            default:
                if(c>='a' && c<='z' || c<='A' && c>='Z')
                 System.out.println("given is a consonant");

                else
                    System.out.println(" given not an alphabet");

           
        }
 

        

        }
}

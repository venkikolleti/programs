import java.util.Scanner;

import javax.swing.plaf.synth.SynthConstants;
import javax.swing.plaf.synth.SynthStyle;

public class if_else {
    public static void main(String[] args){




// if statement...............................

        if(true)
            System.out.println("inside if statemane");
        System.out.println("outside if statement");

        int x=3;
        int y=8;
        if(x<y){
            System.out.println("minimum is " + x);
        }



//number is even or odd...

        Scanner input=new Scanner(System.in);
        System.out.print("enter a int num:");
        int i=input.nextInt();
        if(i%2==0){
            System.out.println(i +" is even num");
        }
        if(i%2!=0){
            System.out.println(i +" is odd num");
        }







// if - else statement.................

    int a=5;
    if(a==4){
        System.out.println("condition is ture");
    }
    else{
        System.out.println("condition is false");
    }




// else if condition...........

    System.out.print("enter a int num:");
    int i2=input.nextInt();
    if(i2<10){
        System.out.println(i2+" is less than 10");
    }
    else if(i2>10){
        System.out.println(i2+" greater than 10");
    }
    else{
        System.out.println("both are equal");
    }






// switch case...........

    int x1=10;
    switch(x1){
        case 11:
            System.out.println("it is 11");
            break;
        case 10:
            System.out.println("it is 10");
            break;
        case 21:
            System.out.println("it is 21");
            break;
        default:
            System.out.println("none of the above");
    }







// calculator by using arithematic operators............


    System.out.print("enter a expression like a + b: ");
    double d1=input.nextDouble();
    char c1=input.next().charAt(0);
    double d2=input.nextDouble();

    if(c1=='+'){
        System.out.println((int)(d1+d2));
    }
    else if(c1=='-'){
        System.out.println((int)(d1-d2));
    }
    else if(c1=='*'){
        System.out.println((int)(d1*d2));
    }
    else{
        System.out.println(d1/d2);
    }






    System.out.print("enter a expression like x + Y: ");
    double D1=input.nextDouble();
    char C1=input.next().charAt(0);
    double D2=input.nextDouble();

    switch(C1){
        case '+':
            System.out.println((int)(D1+D2));
            break;
        case '-':
            System.out.println((int)(D1-D2));
            break;
        case '*':
            System.out.println((int)(D1*D2));
            break;
        case '/':
            System.out.println((D1/D2));
            break;
        default:
            System.out.println("use operator + - * / only");
    }



    


//while loop......................

    int z=1;
    while(z<5){
        System.out.println(z);
        z++;
    }



// do while loop


    int c=1;
    do{
        System.out.println("hi "+c);
        c++;
    }while(c<5);




//for loop........

    for(int n=1;n<6;n++){
        System.out.println("hello "+n);
    }







// nested for loop............

    for(int h=1;h<=5;h++){
        for(int k=1;k<=h;k++){
            System.out.print('*');
        }
        System.out.println();
    }






//break and continue.............


    for(int f=1;f<10;f++){
        if(f%2==0){
            continue;
        }
        System.out.println(f);

    }


    for(int l=1;l<10;l++){
        if(l%3==0){
            break;
        }
        System.out.println(l);
    }







    }
}

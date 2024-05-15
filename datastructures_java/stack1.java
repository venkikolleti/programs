import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

class stack{
    int top=-1,max=5;
    int[] arr=new int[max];

    void push(){
        if(top==max-1){
            System.out.println("stack overflow ");
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("insert num: ");
        int data=sc.nextInt();

        top=top+1;
        arr[top]=data;
    }


    void pop(){
        if(top==-1){
            System.out.println("stack underflow");
        }
        System.out.println("pop number "+arr[top]);
        top=top-1;
    }

    void display(){

        System.out.println("stack elements:");
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}




public class stack1 {
    /*public static int top=-1;
    public static int max=5;
    public static int arr[]=new int[max];


    public static void push(int data){
        if(top==max-1){
            System.out.println("stack is full");
        }
        top=top+1;
        arr[top]=data;
    }*/

    

    public static void main(String args[]){
        //push(4);
        //push(10);
        //push(20);
        //push(30);
        //push(40);
        //push(50);
        //for(int i=top;i>=0;i--){
        //    System.out.println(arr[i]);
        //}




        stack s=new stack();
        s.push();
        s.push();
        s.push();
        s.pop();
        s.display();
    }
}

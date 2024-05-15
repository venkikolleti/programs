class stackOverFlow extends Exception{
    public String toString(){
        return "stack is full";
    }
}

class stackUnderFlow extends Exception{
    public String toString(){
        return "stack is empty";
    }
}


class stack{
    private int size=5;
    private int top=-1;
    private int s[]=new int[size];

    public void push(int x) throws stackOverFlow{
        if(top==size-1){
            throw new stackOverFlow();
        }
        top++;
        s[top]=x;
    }

    public void pop() throws stackUnderFlow{
        if(top==-1)
            throw new stackUnderFlow();
        System.out.println("poped element: "+s[top]);
        top--;
    }
}

public class stack_exception {
    public static void main(String args[]){

        stack S=new stack();

        try{
            //S.pop();
            S.push(10);
            S.push(20);
            S.push(30);
            S.push(40);
            S.push(50);
            S.push(60);
            S.pop();

        }
        catch(stackOverFlow e){
            System.out.println(e);
        }
        catch(stackUnderFlow e){
            System.out.println(e);
        }
    }
}

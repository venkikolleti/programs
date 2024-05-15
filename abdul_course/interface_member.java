interface member{
    public void callback();
}

class store{
    member members[]=new member[10];
    int count=0;
    void register(member m){
        members[count++]=m;
    }
    void invitesale(){
        for(int i=0;i<count;i++){
            members[i].callback();
        }
    }
}

class customer implements member{
    String name;
    customer(String n){
        name=n;
    }
    public void callback(){
        System.out.println("ok, I will visit "+name);
    }

}


public class interface_member {
    public static void main(String args[]){
        store s=new store();
        customer c1=new customer("venki");
        customer c2=new customer("kolleti");

        s.register(c1);
        s.register(c2);

        s.invitesale();


    }
}

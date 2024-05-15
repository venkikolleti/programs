class phone{
    void calls(){
        System.out.println("calls method");
    }
    void sms(){
        System.out.println("sms method");
    }
}

interface camera{
    void click();
    void record();
}

interface musicplayer{
    void play();
    void pause();
    void stop();
}

class smartphone extends phone implements camera,musicplayer{
    void videocall(){
        System.out.println("video call method");
    }
    public void click(){
        System.out.println("click method");
    }
    public void record(){
        System.out.println("record method");
    }
    public void play(){
        System.out.println("play method");
    }
    public void pause(){
        System.out.println("pause method");
    }
    public void stop(){
        System.out.println("stop method");
    }
}

public class interface_phone {
    public static void main(String args[]){

        System.out.println();


        smartphone s=new smartphone();
        s.videocall();
        s.click();
        s.record();
        s.pause();
        s.play();
        s.stop();

        System.out.println();

        phone p=new smartphone();
        p.calls();
        p.sms();

        System.out.println();


        camera c=new smartphone();
        c.click();
        c.record();

        System.out.println();

        musicplayer m=new smartphone();
        m.pause();
        m.play();
        m.stop();




    }
}

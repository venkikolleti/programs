public class interface2 {
    public static void main(String[] args) {
        nicecar obj=new nicecar();
        obj.engineStart();
        obj.engineStop();
        obj.musicStart();
        obj.musicStop();
    }
}


interface Engine{
    void start();
    void stop();
    void accr();
}
interface Music{
    void start();
    void stop();
}

class car implements Engine{

    @Override
    public void start() {
        System.out.println("this start the car");
    }

    @Override
    public void stop() {
     System.out.println("this stop the car");
    }

    @Override
    public void accr() {
        System.out.println("this accr the car");
    }

}

class car2 implements Music{

    @Override
    public void start() {
        System.out.println("start the music");
    }

    @Override
    public void stop() {
        System.out.println("stop the music");
    }

}

class nicecar{
    private Engine engine=new car();
    private Music music =new car2();

    public void engineStart(){
        engine.start();
    }
    public void engineStop(){
        engine.stop();
    }
    public void musicStart(){
        music.start();
    }
    public void musicStop(){
        music.start();
    }
}
public class interfaces {
    public static void main(String[] args) {
        car c=new car();
        System.out.println(car.age);
        c.start();
        c.stop();
        c.accr();
        c.pull();
        c.push();

        engine e=new car();
        e.start();
    }
}

interface engine{
    int age=10; //deafult this static and final
    void start();
    void stop();
    void accr();
}

interface brake{
    void push();
    void pull();
}
interface music{
    void start();
    void stop();
}

class car implements engine,brake,music{

    @Override
    public void push() {
        System.out.println("this is push the brake");
    }

    @Override
    public void pull() {
        System.out.println("this is pull the brake");
    }

    @Override
    public void start() {
        System.out.println("this is start the car");
        System.out.println("start the music also");
    }

    @Override
    public void stop() {
        System.out.println("this is stop the car");
        System.out.println("stop the music also");
    }

    @Override
    public void accr() {
        System.out.println("this is accr the car");
    }

}
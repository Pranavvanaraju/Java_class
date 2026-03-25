interface Engine{
    void startEngine();
}
interface Music{
    void playMusic();
}
class Car implements Engine, Music {
    public void startEngine(){
        System.out.println("Engine started !!");
    }
    public void playMusic(){
        System.out.println("Music is Playing");
    }
}

public class multipleinterface {
    public static void main(String[] args) {
        Engine e = new Car();
        e.startEngine();
        Music m = new Car();
        m.playMusic();
    }
    
}
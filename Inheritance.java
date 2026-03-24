class animal{
    void eat(){
        System.out.println("Animal is eating ");
    }
}


class dog extends animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

class pet extends dog{
    void play(){
        System.out.println("dog is playing");
    }
}
class cat extends animal{
    void sleep(){
        System.out.println("Cat is sleeping");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        pet d=new pet();
        d.eat();
        d.bark();
        d.play();
        cat c=new cat();
        c.sleep();
    }
}

abstract class animal{
    abstract void sound();

    void eat(){
        System.out.println("Animal is eating");
    }
}

class dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }
}

class cat extends animal{
    void sound(){
        System.out.println("cat meows");
    }
}

public class abstraction{
    public static void main(String[] args) {
        animal a;
        a=new dog();
        a.sound();
        a.eat();

        a=new cat();
        a.sound();
    }
}
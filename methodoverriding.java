class animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class cat extends animal{
    void sound()
    {
        System.out.println("Cat Meows");
    }
}



public class methodoverriding {
    public static void main(String[] args) {
        animal a=new cat();
        a.sound();
    }

}
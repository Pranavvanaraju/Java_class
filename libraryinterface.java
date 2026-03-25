interface library{
    void issuebook();
    void returnbook();
}
interface fine{
    void calfine();
}

class student implements library,fine{
    public void issuebook(){
        System.out.println("students can issue 2 books");
    }
    public void returnbook(){
        System.out.println("Students should return the book within 15days");
    }
    public void calfine(){
        System.out.println("Student should payy 5rs/day if the submission day exceeds");
    }
}

class faculty implements library,fine{
    public void issuebook(){
        System.out.println("Faculty can issue 5 books");
    }
    public void returnbook(){
        System.out.println("Faculty should return the book within 24days");
    }
    public void calfine(){
        System.out.println("Faculty should pay 2rs/day if the submission day exceeds");
    }
}


public class libraryinterface {
    public static void main(String[] args) {
        
        library l;
        fine f ;
        l=new student();
        l.issuebook();
        l.returnbook();
        f=new student();
        f.calfine();

        f=new faculty();
        l=new faculty();
        l.issuebook();
        l.returnbook();
        f.calfine();
    }
}

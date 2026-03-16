public class find_grade {
    public static void main(String[] args) {
        int mark = 60;
        int grade = mark/10;
        switch(grade){
            case 10:
            case 9:
                System.out.println("A grade");
                break;
            case 8:
                System.out.println("B grade");
                break;
            case 7:
                System.out.println("C grade");
                break;
            default:
                System.out.println("FAIL");
        }
        
    }
}

public class Robot {

    public boolean judgecircle(String moves){
        int x = 0, y = 0;

        for(char move : moves.toCharArray()){
            switch(move){
                case 'u': y++; break;
                case 'd': y--; break;
                case 'l': x++; break;
                case 'r': x--; break;
            }
        }
        return x==0 && y==0;
    }

    public static void main(String[] args) {

        Robot r = new Robot();

        String move1 = "ud";
        String move2 = "ll";

        System.out.println(r.judgecircle(move1));
        System.out.println(r.judgecircle(move2));
    }
}
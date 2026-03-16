public class Compound_interest {
    public static void main(String[] args) {
        double p=1000;
        double r=10;
        double t=2;

        double a=p*Math.pow(1+r/100, t);
        double ci=a-p;
        System.out.println(ci);
    }
}

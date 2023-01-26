public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("JOHN",15,100,100,30);
        Fighter f2=new Fighter("KABIB",15,100,100,30);
        Ring r=new Ring(f1,f2,90,100);
        r.run();
    }
}
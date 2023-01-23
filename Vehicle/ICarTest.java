package Vehicle;

public class ICarTest {
    public static void main(String[] args) {
        Cars c1 = new Cars();
        c1.model = "Mercedes";
        c1.engine = "1.6";
        c1.mileAge = 10000;
        c1.price = 350000;
        c1.year = 2021;
        c1.printShow();
        System.out.println();
        Cars c2 = new Cars();
        c2.model = "BMW";
        c2.engine = "1.6";
        c2.mileAge = 0;
        c2.price = 800000;
        c2.year = 2023;
        c2.printShow();
    }
}

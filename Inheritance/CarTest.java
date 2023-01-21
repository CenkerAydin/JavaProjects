public class CarTest extends Car {

    public static void main(String[] args) {
        CarTest car1=new CarTest();
        car1.setModel("Mercedes");
        car1.setColor("White");
        car1.setEngine(1.6);
        car1.setMileAge(100000);
        car1.setPrice(300000);
        car1.setYear(2023);
        car1.setAvailability(true);
        car1.showInfos();
        System.out.println();

        CarTest car2=new CarTest();
        car2.setModel("BMW");
        car2.setColor("Black");
        car2.setEngine(1.6);
        car2.setMileAge(10000);
        car2.setPrice(500000);
        car2.setYear(2022);
        car2.setAvailability(true);
        car2.showInfos();
    }
}

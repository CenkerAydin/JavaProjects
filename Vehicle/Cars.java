package Vehicle;

public class Cars implements Car{
    String engine;
    String model;
    int mileAge;
    float price;
    int year;
    @Override
    public void engine(String engine){
        this.engine=engine;
    }
    @Override
    public void model(String model){
        this.model=model;
    }
    @Override
    public void mileAge(int mileAge){
        this.mileAge=mileAge;
    }
    @Override
    public void price(float price){
        this.price=price;
    }
    @Override
    public void year(int year){
        this.year=year;
    }

    public void printShow(){
        System.out.println("The Car info...");
        System.out.println("Model: "+model);
        System.out.println("Engine: "+engine);
        System.out.println("Mileage: "+mileAge);
        System.out.println("Price: "+price);
        System.out.println("Year: "+year);
    }
}

public class Car {
    private String model;
    private String color;
    private double engine;
    private int mileAge;
    private int year;
    private float price;
    private boolean availability;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public Car(){
    }
    public Car(String model, String color, double engine, int mileAge,
               int year, float price, boolean availability) {
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.mileAge = mileAge;
        this.year = year;
        this.price = price;
        this.availability = availability;
    }
    public void showInfos(){
        System.out.println("Model: "+getModel());
        System.out.println("Color: "+getColor());
        System.out.println("Engine: "+getEngine());
        System.out.println("Mileage: "+getMileAge());
        System.out.println("Year: "+getYear());
        System.out.println("Price: "+getPrice());
        System.out.println("Availability: "+isAvailability());
    }
}





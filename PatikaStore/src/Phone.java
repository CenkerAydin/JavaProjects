public class Phone extends Product{
    private int memory;
    private double inç;
    private int batteryPower;
    private int ram;

    public Phone(int id, String name, double price, String brand, int memory, int inç, int ram) {
        super(id, name, price, brand);
        this.memory=memory;
        this.inç=inç;
        this.ram=ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getInç() {
        return inç;
    }

    public void setInç(double inç) {
        this.inç = inç;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}

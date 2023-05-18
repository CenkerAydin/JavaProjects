public class Notebook extends Product {
    private int ram;
    private int storage;
    private int inç;
    public Notebook(int id,String name,double price, String brand,int storage,int inç,int ram){
      super(id,name,price,brand);
      this.storage=storage;
      this.inç=inç;
      this.ram=ram;
    }
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getInç() {
        return inç;
    }

    public void setInç(int inç) {
        this.inç = inç;
    }
}

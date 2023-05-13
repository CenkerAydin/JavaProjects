public class MyList<T>{
    private T[] list;
    private int size;
    private int capacity;
    public MyList(){
        this(10);
    }
    public MyList(int capacity){
        this.capacity=capacity;
        list =(T[]) new Object[capacity];
    }
    public void add(T element){
        if (size==capacity){
            T[] newList= (T[])new Object[capacity*2];
            for (int i=0;i<size;i++){
                newList[i]= list[i];
            }
            list =newList;
            capacity *=2;
        }
        list[size]=element;
        size++;
    }

    public T[] getList() {
        return list;
    }

    public void setList(T[] list) {
        this.list = list;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

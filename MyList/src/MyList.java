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
    public T get(int index) {
        if (index >=size || index < 0){
            return null;
    }
    return list[index];
    }

    public T remove(int index){
        if (index >=size || index<0){
            return null;
        }
        T removed=list[index];
        for (int i=index;i<size-1;i++){
            list[i]=list[i+1];
        }
        list[size-1]=null;
        size--;
        return removed;
    }

    public T set(int index,T data){
        if (index>=size || index<0){
            return null;
        }
        list[index]=data;
        return data;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i=0;i<size;i++){
            sb.append(list[i]);
            if (i<size-1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int indexOf(T data){
        for (int i=0;i<size;i++){
            if (list[i]==data){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for (int i=size-1;i>=0;i--){
            if (list[i]==data){
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public T[] toArray(){
        T[] arr=(T[]) new Object[size];
        for (int i=0;i<size;i++){
            arr[i]=list[i];
        }
        return arr;
    }

    public void clear(){
        for (int i=0;i<size;i++){
            list[i]=null;
        }
        size=0;
    }

    public T[] sublist(int start, int finish){
        T[]arr=(T[])new Object[finish-start];
        for (int i=start;i<=finish;i++){
            arr[i]=list[i];
        }
        return arr;
    }
    public T[] getList() {
        return list;
    }

    public boolean contains(T data){
        return indexOf(data)!=-1;
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

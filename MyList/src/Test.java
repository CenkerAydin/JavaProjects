public class Test {
    public static void main(String[] args) {
        MyList<Integer>list =new MyList<>();
        System.out.println("List size: "+list.getSize());
        System.out.println("List capacity: "+list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        System.out.println("Added new element in the list");
        System.out.println("List size: "+list.getSize());
        System.out.println("List capacity: "+list.getCapacity());

    }
}

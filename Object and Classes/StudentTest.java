public class StudentTest {
    public static void main(String args[]){
        Student s1 = new Student("John",22,180,75);
        Student s2=new Student("Jack",25,190,85);

        System.out.println("Name: "+s1.getName());
        System.out.println("Age: "+s1.getAge());
        System.out.println("Height: "+s1.getHeight());
        System.out.println("Weight: "+s1.getWeight());

        System.out.println("-------------");
        System.out.println("Name: "+s2.getName());
        System.out.println("Age: "+s2.getAge());
        System.out.println("Height: "+s2.getHeight());
        System.out.println("Weight: "+s2.getWeight());
    }
}


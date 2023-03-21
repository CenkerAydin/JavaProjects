public class Test {
    public static void main(String[] args) {
        Person p1=new Person("Cenker","1903 Street","1234567899","cenker@edu.tr");
        Student s1=new Student("Will","12 Town","1234565454","ad@al",Student.JUNIOR);

        Employee e1=new Employee("Tom","98 Street","12312412412","asdas@gasf",134,100.000);
        Faculty f1=new Faculty("Karan","15","123214124","ad@fas",156,19.000,8,"Professor");
        Staff staff=new Staff("Jack","90 Street","1237898754","asd@asd",145,10.000,"Assistant");

        System.out.println(p1.toString());
        System.out.println("--------------");
        System.out.println(s1.toString());
        System.out.println("--------------");
        System.out.println(e1.toString());
        System.out.println("--------------");
        System.out.println(f1.toString());
        System.out.println("--------------");
        System.out.println(staff.toString());
    }
}

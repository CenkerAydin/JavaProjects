public class PersonTest extends Person {
    public static void main(String[] args) {

        PersonTest p1=new PersonTest();
        p1.setName("Cenk");
        p1.setAge(21);
        p1.setGender("Male");
        p1.setContactNumber("2422422422");
        p1.setMaritalStatus("Single");
        p1.setOccupation("Engineer");
        p1.showInfos();
        System.out.println();
        PersonTest p2=new PersonTest();
        p2.setName("Miriam");
        p2.setAge(25);
        p2.setGender("Female");
        p2.setContactNumber("5365435432");
        p2.setMaritalStatus("Married");
        p2.setOccupation("Doctor");
        p2.showInfos();

    }
}

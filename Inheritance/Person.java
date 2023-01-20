public class Person {
    private String name;
    private int age;
    private String gender;
    private String contactNumber;
    private String maritalStatus;
    private String occupation;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Person(String name,int age,String gender,String contactNumber,
                  String maritalStatus,String occupation){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.contactNumber=contactNumber;
        this.maritalStatus=maritalStatus;
        this.occupation=occupation;
    }
    public Person(){

    }

    public void showInfos(){
        System.out.println("Information...");
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Gender: "+getGender());
        System.out.println("Contact Number: "+getContactNumber());
        System.out.println("Marital Status: "+getMaritalStatus());
        System.out.println("Occupation: "+getOccupation());
    }
}

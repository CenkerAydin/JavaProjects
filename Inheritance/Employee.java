import java.util.Date;

public class Employee {
    private String name;
    private String department;
    private  int salary;
    private String title;
    private int hireDate;
    private String contactNumber;

    private  boolean isManager;


    public Employee(String name,String department,int salary,String title
    ,int hireDate,String contactNumber,boolean isManager) {
        this.name = name;
        this.department=department;
        this.salary=salary;
        this.title=title;
        this.hireDate=hireDate;
        this.contactNumber=contactNumber;
        this.isManager=isManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public void showInfos(){
        System.out.println("Information...");
        System.out.println("Name : "+getName());
        System.out.println("Department: "+getDepartment());
        System.out.println("Salary: "+getSalary());
        System.out.println("Title: "+getTitle());
        System.out.println("Hire Date: "+getHireDate());
        System.out.println("Contace Number: "+getContactNumber());
        System.out.println("is Manager?: "+isManager());
    }

}

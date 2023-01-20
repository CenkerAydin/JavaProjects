public class EmployeeTest extends Employee {
    private  int numOfEmployees;
    public EmployeeTest(String name, String department, int salary, int numOfEmployees, String title,
                        int hireDate, String contactNumber,boolean isManager){
        super(name, department, salary,title,hireDate,contactNumber,isManager);
        this.numOfEmployees=numOfEmployees;
    }

    @Override
    public void showInfos() {
      super.showInfos();
        System.out.println("Sorumlu Kişi Sayısı: "+this.numOfEmployees);
    }

    public static void main(String[] args) {
        EmployeeTest e1=new EmployeeTest("Cenker","Engineer",15000,
                10,"Computer Engineer",2021,"242242242",true);

        e1.showInfos();
    }
}

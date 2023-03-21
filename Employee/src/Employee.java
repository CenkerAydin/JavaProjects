public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        if (salary<1000) {
            return 0;
        }else {
            double tax=((salary*3)/100);
            return tax;
        }
    }
    public double bonus(){
        if (workHours>40){
            double bonus=(workHours-40)*30;
            return bonus;
        }

        return 0;
    }

    public double raiseSalary(){
        final int year=2021;
        if ((year-hireYear)<10) {
            double raiseSalary=(salary*5)/100;
            return raiseSalary;
        } else if ((year-hireYear)<19) {
            double raiseSalary=(salary*10)/100;
            return raiseSalary;
        }else{
            double raiseSalary=(salary*15)/100;
            return raiseSalary;
        }
    }

    public void showInfos(){
        System.out.println("Name: "+this.getName());
        System.out.println("Salary: "+this.getSalary());
        System.out.println("Work Hours in a week: "+this.getWorkHours());
        System.out.println("Tax: "+this.tax());
        System.out.println("Bonus: "+this.bonus());
        System.out.println("Raise Salary: "+this.raiseSalary());
        System.out.println("Salary with taxes and bonuses: "+(salary+bonus()-tax()));
        System.out.println("Total Salary: "+(salary+raiseSalary()+bonus()-tax()));
        System.out.println();
    }
}

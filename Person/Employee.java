class Employee extends Person{
    private int office;
    private double salary;
    private MyDate dateHired;
    Employee(String name,String address,String phone,String email,int office,double salary){
        super(name,address,phone,email);
        this.office=office;
        this.salary=salary;
        this.dateHired=new MyDate();
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateHired() {
        return dateHired.getMonth()+"/"+dateHired.getDay()+"/"+dateHired.getYear();
    }

    public void setDateHired(MyDate dateHired) {
        dateHired=new MyDate();
    }
    @Override
    public String toString(){
        return super.toString()+"\nOffice: "+getOffice()+"\nSalary: "+getSalary()+
                "\nDate Hired: "+getDateHired();
    }
}
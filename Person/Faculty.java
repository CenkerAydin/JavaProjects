class Faculty extends Employee{
    private int officeHours;
    private String rank;
    Faculty(String name,String addres,String phone,String email,int office,double salary,
            int officeHours,String rank){
        super(name,addres,phone,email,office,salary);
        this.officeHours=officeHours;
        this.rank=rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    @Override
    public String toString(){
        return super.toString()+"\nOfficeHours: "+getOfficeHours()+"\nRank: "+getRank();
    }
}

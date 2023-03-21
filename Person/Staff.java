class Staff extends Employee{
    private String title;
    Staff(String name,String addres,String phone,String email,int office,double salary,String title){
        super(name,addres,phone,email,office,salary);
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return super.toString()+ "\nTitle: "+getTitle();
    }

}

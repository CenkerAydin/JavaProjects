class Student extends Person{
    private int classStatus;
    public final static int FRESHMAN=1;
    public final static int SOPHOMORE=2;
    public final static int JUNIOR=3;
    public final static int SENIOR=4;

    public Student(String name,String addres,String phone,String email,int classStatus){
        super(name,addres,phone,email);
        this.classStatus=classStatus;
    }

    public String getClassStatus() {
        switch (classStatus) {
            case 1: return "Freshman";
            case 2: return "Sophomore";
            case 3: return "Junior";
            case 4:return "Senior";
            default: return "Unknown";
        }
    }

    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }
    @Override
    public String toString(){
        return super.toString() +"\nClass Status: "+getClassStatus();
    }
}

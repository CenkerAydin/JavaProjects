package University;

public class Academician extends Worker{

    private String department;
    private String title;
    public Academician(){
    }
    public Academician(String name,String phone,String eposta,String department,String title){
        super(name, phone, eposta);
        this.department=department;
        this.title=title;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void showInfosAcademician(String name,String phone,String eposta,String department,String title){
        System.out.println("Informations");
        System.out.println("Academician Name: "+this.getName());
        System.out.println("Academician phone: "+this.getPhone());
        System.out.println("Academician eposta: "+this.getEposta());
        System.out.println("Academician departmen: "+this.department);
        System.out.println("Academician title: "+this.title);
    }
     public void attendClass(){
         System.out.println(this.getName() +" lectured.");
     }
     public void meeting(){
         System.out.println(this.getName()+" joined the meeting");
     }
}

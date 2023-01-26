package University;

public class Assistant extends Academician{

    private String workingHours;

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public Assistant(){
    }
    public Assistant(String name,String phone,String eposta,
                     String department,String title,String workingHours) {
        super(name, phone, eposta, department, title);
        this.workingHours = workingHours;
    }
    public void quiz(){
        System.out.println(this.getName()+ "took the quiz.");
    }
    public void showInfosAssistant(){
        System.out.println("Informations");
        System.out.println("Assistant name: "+this.getName());
        System.out.println("Assistant phone: "+this.getPhone());
        System.out.println("Assistant eposta: "+this.getEposta());
        System.out.println("Assistant departmen: "+this.getDepartment());
        System.out.println("Assistant title: "+this.getTitle());
    }

}

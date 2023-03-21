package University;

public class LabAssistant extends Assistant{
    public void lab(){
        System.out.println(this.getName()+" lab lectured.");
    }
    public void showInfosLabAssistant(){
        System.out.println("Informations");
        System.out.println("Lab Assistant name: "+this.getName());
        System.out.println("Lab Assistant phone: "+this.getPhone());
        System.out.println("Lab Assistant eposta: "+this.getEposta());
        System.out.println("Lab Assistant departmen: "+this.getDepartment());
        System.out.println("Lab Assistant title: "+this.getTitle());
    }
}

package University;

public class Lecturer extends Academician{
    String doorNumber;
    public Lecturer(String name,String phone,String eposta,String department,
                    String title,String doorNumber){
        super(name, phone, eposta, department, title);
        this.doorNumber=doorNumber;
    }
    public void exam(){
        System.out.println(this.getName()+" lecturer took the exam");
    }
    public void meeting(){
        System.out.println(this.getName()+" joined the meeting");
    }
}

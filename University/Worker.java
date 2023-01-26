package University;

public class Worker {
    private String name;
    private String phone;
    private String eposta;
    public Worker(String name,String phone,String eposta){
        this.name=name;
        this.phone=phone;
        this.eposta=eposta;
    }
    public Worker(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void login(String name ){
        System.out.println(this.name+" entered the university.");
    }
    public  void exit(String name){
        System.out.println(this.name+ "exited the university.");
    }
    public void eat(String name){
        System.out.println(this.name+" eat.");
    }
    public void showInfos(String name,String phone,String eposta){
        System.out.println("Informations...");
        System.out.println("Name: "+this.name);
        System.out.println("Phone: "+this.phone);
        System.out.println("Eposta: "+this.eposta);

    }
}

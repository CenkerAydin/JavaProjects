public class Person {
    private String name;
    private String addres;
    private String phone;
    private String email;
    public Person(){
    }
    public Person(String name,String addres,String phone,String email){
        this.name=name;
        this.addres=addres;
        this.phone=phone;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString(){
        return "Name:" +getName()+ "\nAddress: "+getAddres()+ "\nPhone: "
                +getPhone()+"\nEmail: "+getEmail();
    }
}


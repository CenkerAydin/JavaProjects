package AnimalClassification;

public class Kopek extends Animal implements SesliHayvan {
    public Kopek(String isim,int yas){
        super(isim, yas);
    }
    @Override
    public void eat(){
        System.out.println(this.isim+" yemek yiyor.");
    }
    public void sesCikar(){
        System.out.println(this.isim+" havlıyor.");
    }
    @Override
    public void sleep(){
        System.out.println(this.isim+" uyuyor.");
    }
    public void wakeUp(){
        System.out.println(this.isim+" uyandı.");
    }
    public void showInfos(){
        System.out.println("Hayvan bilgileri...");
        System.out.println("İsim: "+isim);
        System.out.println("Yaş: "+yas);
        eat();
        sesCikar();
        sleep();
        wakeUp();
    }
}

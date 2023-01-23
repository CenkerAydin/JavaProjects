package AnimalClassification;
class Tavsan extends Animal implements SessizHayvan {
    public Tavsan(String isim,int yas){
        super(isim, yas);
    }
    public void eat(){
        System.out.println(this.isim+" yemek yiyor");
    }
    public void sesCikarma(){
        System.out.println(this.isim+" sessiz hayvandır.");
    }
    public void sleep(){
        System.out.println(this.isim+" uyuyor.");
    }
    public void wakeUp(){
        System.out.println(this.isim+" uyandı.");
    }

    public void showInfos(){
        System.out.println("Hayvan Bilgileri...");
        System.out.println("İsim: "+isim);
        System.out.println("Yaş: "+yas);
        eat();
        sesCikarma();
        sleep();
        wakeUp();
    }
}

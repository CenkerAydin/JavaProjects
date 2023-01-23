package AnimalClassification;

abstract class Animal {
   protected String isim;
   protected int yas;
   public Animal(String isim,int yas){
       this.isim=isim;
       this.yas=yas;
   }
   public abstract void eat();
   public abstract void sleep();
   public abstract void  wakeUp();
}

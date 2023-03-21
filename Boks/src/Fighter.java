public class Fighter {
     String name;
     int damage;
    int health;
    int weight;
     double dodge;


    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name=name;
        this.damage = damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
    }

    public int hit(Fighter fighter){
        System.out.println(this.name+" =>" +fighter.name+" "+this.damage+" struck damage.");
        if (fighter.dodge()) {
            System.out.println(fighter.name + " dodges incoming damage.");
            return fighter.health;
        }
        if (fighter.health-this.damage<0)
            return 0;

        return fighter.health-this.damage;
    }

    public boolean dodge(){
        double randomValue=Math.random()*100;
        if (randomValue>this.dodge){
            System.out.println("Random  dodge value: "+randomValue);
            System.out.println("Dodge: "+this.dodge);

        }if (randomValue<=this.dodge){
            System.out.println("Random dodge value: "+randomValue);
            System.out.println("Dodge: "+this.dodge);

        }
        return  randomValue<=this.dodge;
    }
}

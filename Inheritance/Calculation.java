 class Calculation {
    int z;
    public void addition(int x,int y){
        z=x+y;
        System.out.println("The sum of the given numbers: "+z);
    }
    public void Substraction(int x,int y){
        z=x-y;
        System.out.println("The difference between the given numbers: "+z);
    }
    public void multiple(int x,int y){
        z=x*y;
        System.out.println("The multiple between the given numbers: "+z);
    }
    public void divide(int x,int y){
        if ((y==0))
            System.out.println("Denominator should not be 0");

        z=x/y;
        System.out.println("The divide between the given numbers: "+z);
    }
}
class MyCalculation extends Calculation{
    public static void main(String[] args) {
        int a=20, b=2;
        MyCalculation myCalculation=new MyCalculation();
        myCalculation.addition(a,b);
        myCalculation.Substraction(a,b);
        myCalculation.multiple(a,b);
        myCalculation.divide(a,b);
    }
}

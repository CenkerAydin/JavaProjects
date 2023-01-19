public class StockTest {
    public static void main(String[] args) {
        Stock s1=new Stock("JKN","JOHN",80,100);

        System.out.println("Symbol is "+s1.getSymbol());
        System.out.println("Name is "+s1.getName());
        System.out.println("Previous price is "+s1.getPreviousClosingPrice());
        System.out.println("Current price is "+s1.getCurrentPrice());
        System.out.println("The percent change %"+s1.getChangePercent());



    }
}

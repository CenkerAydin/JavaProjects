public class Stock {
     private String symbol;
     private String name;
     private double previousClosingPrice;
     private  double currentPrice;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    Stock(String symbol, String name,double previousClosingPrice,double currentPrice){
    this.symbol=symbol;
    this.name=name;
    this.previousClosingPrice=previousClosingPrice;
    this.currentPrice=currentPrice;

    }
    double getChangePercent(){
        return ((currentPrice-previousClosingPrice)/
                previousClosingPrice)*100;
    }
}

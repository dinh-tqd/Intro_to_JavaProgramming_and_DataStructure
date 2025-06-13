package chap09;

public class Ex0902 {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle");

        stock1.setCurrentPrice(34.5);
        stock1.setCurrentPrice(34.35);

        System.out.println(stock1.previousClosingPrice);
        System.out.println(stock1.currentPrice);
        System.out.println(stock1.getChangePercent());
    }
}

class Stock {
    String symbol;
    String name;

    double previousClosingPrice;
    double currentPrice;

    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        return (currentPrice - previousClosingPrice) / currentPrice * 100;
    }

    public void setCurrentPrice(double currentPrice) {
        previousClosingPrice = this.currentPrice;
        this.currentPrice = currentPrice;
    }
}

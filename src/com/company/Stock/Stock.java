package com.company.Stock;

public class Stock {
    private String simbol;
    private String stock;
    private double closingPrice;
    private double currentPrice;

    Stock(String simbol, String stock, double closingPrice, double currentPrice) {
        this.simbol = simbol;
        this.stock = stock;
        this.currentPrice = currentPrice;
        this.closingPrice = closingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
    }

    public double getChangePercent() {
        return 100 * ((currentPrice - closingPrice) / closingPrice);
    }
}

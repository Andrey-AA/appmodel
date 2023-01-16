package ru.appmodel;

public class Parametrs {
    int requestAmount;
    int requestCost;

    public Parametrs(int requestAmount, int getRequestCost) {
        this.requestAmount = requestAmount;
        this.requestCost = getRequestCost;
    }

    public int getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(int requestAmount) {
        this.requestAmount = requestAmount;
    }

    public int getGetRequestCost() {
        return requestCost;
    }

    public void setGetRequestCost(int getRequestCost) {
        this.requestCost = getRequestCost;
    }
}

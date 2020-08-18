package web.controller;

public class Car {
    private String model;
    private int power;
    private double enginVolum;

    public Car(String model, int power, double enginVolum) {
        this.model = model;
        this.power = power;
        this.enginVolum = enginVolum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getEnginVolum() {
        return enginVolum;
    }

    public void setEnginVolum(int enginVolum) {
        this.enginVolum = enginVolum;
    }
    public String toString(){
        return "Automobile: "+getModel()+" мощность: "+getPower()+" engine volume: "+getEnginVolum()+" liters";
    }
}

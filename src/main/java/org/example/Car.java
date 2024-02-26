package org.example;

public class Car {
    private String mark;
    private int power;
    private int EngineCapacity;
    private double weightTon;
    private int speed;
    private String color;
    private String availabilityAI;

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getEngineCapacity() {
        return EngineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        EngineCapacity = engineCapacity;
    }

    public double getWeightTon() {
        return weightTon;
    }

    public void setWeightTon(double weightTon) {
        this.weightTon = weightTon;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAvailabilityAI() {
        return availabilityAI;
    }

    public void setAvailabilityAI(String availabilityAI) {
        this.availabilityAI = availabilityAI;
    }
}
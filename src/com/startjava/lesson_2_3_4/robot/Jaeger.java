package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String status;
    private String origin;
    private float height;
    private float weight;
    private float speed;
    private int strenght;
    private int armor;

    public Jaeger () {
    }

    public Jaeger (String modelName, String mark, String status, String origin,
            float height, float weight, float speed, int strenght, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.status = status;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strenght = strenght;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println("moving");
    }

    public String scanKaiju() {
        return "scanning";
    }

    public void useVortexCannon(){
        System.out.println("activated");
    }

    
}
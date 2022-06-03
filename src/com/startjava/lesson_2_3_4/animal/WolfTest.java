package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("мужской");
        wolf.setNickname("Волчара");
        wolf.setWeight(45);
        wolf.setAge(5);
        wolf.setColor("серый");
        System.out.println("пол волка - " + wolf.getSex());
        System.out.println("кличка волка - " + wolf.getNickname());
        System.out.println("рост волка - " + wolf.getWeight());
        System.out.println("возраст волка - " + wolf.getAge());
        System.out.println("окрас волка - " + wolf.getColor());
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
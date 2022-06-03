package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        //Создаем первого робота
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Cherno Alpha");
        jaeger1.setMark("Mark-1");
        jaeger1.setStatus("Active");
        jaeger1.setOrigin("Russia");
        jaeger1.setHeight(85.34f);
        jaeger1.setWeight(2.412f);
        jaeger1.setSpeed(3f);
        jaeger1.setStrenght(10);
        jaeger1.setArmor(10);
        //Выводим информацию о первом роботе
        System.out.println("Робот " + jaeger1.getModelName() + " " + jaeger1.getMark());
        System.out.println("В данный момент имеет статус: " + jaeger1.getStatus());
        System.out.println("Страна происхождения робота: " + jaeger1.getOrigin());
        System.out.println("Робот имеет следующие технические характеристики:");
        System.out.println("Высота: " + jaeger1.getHeight() + " м");
        System.out.println("Вес: " + jaeger1.getWeight() + " тн");
        System.out.println("Скорость: " + jaeger1.getSpeed() + " м/мин");
        System.out.println("Сила: " + jaeger1.getStrenght());
        System.out.println("Броня: " + jaeger1.getArmor());
        //Создаем второго робота
        Jaeger jaeger2 = new Jaeger("Gipsy Danger", "Mark-3", "Active", "USA", 
                79.25f, 1.98f, 7f, 8, 6);
        //Выводим информацию о втором роботе
        System.out.println("Робот " + jaeger2.getModelName() + " " + jaeger2.getMark());
        System.out.println("В данный момент имеет статус: " + jaeger2.getStatus());
        System.out.println("Страна происхождения робота: " + jaeger2.getOrigin());
        System.out.println("Робот имеет следующие технические характеристики:");
        System.out.println("Высота: " + jaeger2.getHeight() + " м");
        System.out.println("Вес: " + jaeger2.getWeight() + " тн");
        System.out.println("Скорость: " + jaeger2.getSpeed() + " м/мин");
        System.out.println("Сила: " + jaeger2.getStrenght());
        System.out.println("Броня: " + jaeger2.getArmor());
        //Подготовка к бою
        System.out.println("В бой отправлется " + jaeger1.getModelName());
        if (jaeger1.drift()) {
            jaeger1.move();
            System.out.println(jaeger1.scanKaiju());
            jaeger1.useVortexCannon();
        }
        System.out.println("В бой отправлется " + jaeger2.getModelName());
        if (jaeger2.drift()) {
            jaeger2.move();
            System.out.println(jaeger2.scanKaiju());
            jaeger2.useVortexCannon();
        }
        //Бой
        System.out.println(jaeger1.getModelName() + " получает удар!");
        System.out.println(jaeger1.getModelName() 
                + " теряет 1 очко брони и теряет 1 очко скорости");
        jaeger1.setArmor(jaeger1.getArmor() - 1);
        jaeger1.setSpeed(jaeger1.getSpeed() - 1f);
        System.out.println(jaeger2.getModelName() + " получает сильный удар!");
        System.out.println(jaeger2.getModelName() + " уничтожен!");
        jaeger2.setStatus("Destroyed");
        //Оценка состояния роботов после боя
        System.out.println("Оценка состояния роботов после боя.");
        System.out.println("Робот " + jaeger1.getModelName() + " " + jaeger1.getMark());
        System.out.println("В данный момент имеет статус: " + jaeger1.getStatus());
        System.out.println("Робот имеет следующие технические характеристики:");
        System.out.println("Скорость: " + jaeger1.getSpeed() + " м/мин");
        System.out.println("Сила: " + jaeger1.getStrenght());
        System.out.println("Броня: " + jaeger1.getArmor());
        System.out.println("Робот " + jaeger2.getModelName() + " " + jaeger2.getMark());
        System.out.println("В данный момент имеет статус: " + jaeger2.getStatus());
    }
}
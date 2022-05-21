public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "мужской";
        wolf.nickname = "Волчара";
        wolf.weight = 45;
        wolf.age = 5;
        wolf.color = "серый";
        System.out.println("пол волка - " + wolf.sex);
        System.out.println("кличка волка - " + wolf.nickname);
        System.out.println("рост волка - " + wolf.weight);
        System.out.println("возраст волка - " + wolf.age);
        System.out.println("окрас волка - " + wolf.color);
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
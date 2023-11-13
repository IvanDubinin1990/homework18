public class Main {
    public static void main(String[] args) {
        //todo Реализовать класс Утка и Собака по описанным в ТЗ правилам.

        Dog dog = new Dog("Bob", 30.5, 7);
        Duck duck = new Duck("Kriy", 15.7, 4);

        dog.walk();
        duck.walk();
        dog.move();
        duck.move();



    }
}

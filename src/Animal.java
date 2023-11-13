public class Animal {

    protected String name;
    protected double weight;
    protected int age;

    public Animal(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void walk () {
        System.out.println("животное идет по земле");
    }
}

class Dog extends Animal {

    public Dog(String name, double weight, int age) {
        super(name, weight, age);
    }
    public void move () {
        System.out.println("Собака по кличке " + name + " бежит по земле");
    }
}

class Duck extends Animal {

    public Duck(String name, double weight, int age) {
        super(name, weight, age);
    }
    public void move () {
        System.out.println("Утка по кличке " + name + " летит в облаках");
    }
}

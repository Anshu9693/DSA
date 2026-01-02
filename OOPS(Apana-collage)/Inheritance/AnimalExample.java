package Inheritance;

class Animal {
    int legs;

    public void printInfo() {
        System.out.println(this.legs);
    }
}

class Dog extends Animal {
    String sound;

    public void printInfo() {
        System.out.println(this.sound);
    }

}

class DogChild extends Dog {

}

public class AnimalExample {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.legs = 4;
        d1.printInfo();
        DogChild dc1 = new DogChild();
        dc1.sound = "bark";
        dc1.printInfo();

    }
}

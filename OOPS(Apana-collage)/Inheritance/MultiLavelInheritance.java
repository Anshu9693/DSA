package Inheritance;

class Animal{
    int legs;
}

class Hourse extends Animal{
    String food;
}
class Hen extends Hourse {
    Boolean canFly;
    public void printInfo(){
        System.out.println(this.food);
        System.out.println(this.legs);
        System.out.println(this.canFly);
    }
}

public class MultiLavelInheritance {
    public static void main(String[] args) {
        Hen h1 = new Hen();
        h1.food="veg";
        h1.canFly = false;
        h1.legs=4;
        h1.printInfo();
    }
}

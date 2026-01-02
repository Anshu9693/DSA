package Inheritance;

class Animal{
    int legs;
    public void getInfo(){
        System.out.println(this.legs);
    }
}

class Hourse extends Animal{
    String food;
     public void getInfo(){
        System.out.println(this.food);
        System.out.println(this.legs);
    }
}

public class SingleLavelInheritance {
    public static void main(String[] args) {
        Hourse h1 = new Hourse();
        h1.food = "grass";
        h1.legs= 4;
        h1.getInfo();

    }
}

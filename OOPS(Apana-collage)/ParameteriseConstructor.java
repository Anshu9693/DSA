class Students{
    String name;
    int age;

    public void  printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Students(String name, int age){
        this.name = name;
        this.age= age;
    }

}

public class ParameteriseConstructor {
    public static void main(String[] args) {
        Students s1 = new Students("anshu", 22);
        s1.printInfo();
    }
    
}
